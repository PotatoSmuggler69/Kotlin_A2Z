@echo off
setlocal enabledelayedexpansion

REM  Copyright (c) 2026 Abhishek Manna. All rights reserved.
REM Kotlin Compile and Run Script
REM Usage: run.bat filename [option]
REM Options: compile (only compile), keep (keep JAR), run (only run)

set FILENAME=%1
set OPTION=%2

if "%FILENAME%"=="--help" goto :showhelp
if "%FILENAME%"=="-h" goto :showhelp
if "%FILENAME%"=="/?" goto :showhelp

if "%FILENAME%"=="" (
    echo Usage: run.bat filename [option]
    echo.
    echo Options:
    echo   compile  - Only compile, don't run
    echo   keep     - Compile and run, keep JAR file
    echo   run      - Only run existing JAR
    exit /b
)

REM Remove .kt extension if provided
if "%FILENAME:~-3%"==".kt" (
    set FILENAME=!FILENAME:~0,-3!
)

REM Remove .\ prefix if provided  
if "%FILENAME:~0,2%"==".\" (
    set FILENAME=!FILENAME:~2!
)

REM Compile unless "run-only" option
if NOT "%OPTION%"=="run" (
    echo Compiling %FILENAME%.kt...
    call kotlinc %FILENAME%.kt -include-runtime -d %FILENAME%.jar
    if errorlevel 1 (
        echo ERROR: Compilation failed
        exit /b 1
    )
    echo Compilation successful
)

REM If compile-only, exit
if "%OPTION%"=="compile" exit /b 0

REM Run the JAR
echo.
echo Running %FILENAME%.jar...
echo.
call java -jar %FILENAME%.jar
echo.

REM Clean up JAR unless "keep" option
if NOT "%OPTION%"=="keep" (
    echo Deleting %FILENAME%.jar
    del /q %FILENAME%.jar
)

exit /b 0

:showhelp
echo.
echo ============================================
echo    Kotlin Compile and Run Script
echo    Script Version  1.3 
echo    Copyright (c) 2026 Abhishek Manna. All rights reserved. 
echo ============================================
echo.
echo USAGE: run.bat filename [option]
echo.
echo PARAMETERS:
echo   filename     - Name of your .kt file (with or without .kt extension)
echo.
echo OPTIONS:
echo   compile      - Only compile, don't run the program
echo   keep         - Compile and run, but keep the JAR file
echo   run          - Only run existing JAR (skip compilation)
echo.
echo FLAGS:
echo   --help, -h, /?   - Show this help message
echo.
echo EXAMPLES:
echo   run.bat K001_HelloWorld
echo   run.bat K001_HelloWorld.kt
echo   run.bat K001_HelloWorld compile
echo   run.bat K001_HelloWorld keep
echo   run.bat K001_HelloWorld run
echo   run.bat --help
echo.
echo DEFAULT BEHAVIOR:
echo   Compiles the .kt file, runs the JAR, then deletes it.
echo.
echo ============================================
echo.
exit /b 0
