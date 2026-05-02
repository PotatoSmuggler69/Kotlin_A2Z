# 12-Week Android Framework / Platform Todo

## Week 1 - System Foundations and Android Stack Map
- [ ] Android stack map: bootloader, kernel, native services, HAL, Binder, ART, framework, app, rendering
- [ ] SoC architecture: ARM Cortex-A/Cortex-X, big.LITTLE, DynamIQ, CPU, GPU, DSP, modem roles
- [ ] Memory hierarchy: registers, L1, L2, L3, DRAM
- [ ] Hardware buses and peripherals: I2C, SPI, UART, PCIe, MIPI CSI/DSI, touchscreen, camera, display
- [ ] ARM architecture basics: EL0-EL3, TrustZone, MMU, SMMU, GIC
- [ ] Android Verified Boot, secure boot chain, hardware root of trust
- [ ] Linux foundations: process, thread, syscall, context switch, userspace vs kernelspace
- [ ] Virtual memory foundations: mmap, page tables, page faults, address space basics
- [ ] Full Android boot overview: bootloader, kernel, init, servicemanager, Zygote, SystemServer, Home activity
- [ ] AOSP repo map: frameworks/base, system/core, system/sepolicy, art, bionic, build/soong, build/make, packages/modules
- [ ] APK structure: AndroidManifest.xml, classes.dex, res, assets, lib, resources.arsc
- [ ] DEX basics: register-based bytecode, multidex, dex2oat overview

## Week 2 - App Process, Main Thread, and App-Layer Internals
- [ ] App process startup: ActivityThread.main, Looper.prepareMainLooper, ActivityThread.attach, AMS Binder call, Application.onCreate
- [ ] Context internals: ContextImpl, Application context, Activity context, Service context
- [ ] Activity lifecycle internals: handleLaunchActivity, Instrumentation.callActivityOnCreate, savedInstanceState Parcel flow
- [ ] Intent system: explicit intents, implicit intents, IntentFilter matching, URI permissions, FLAG_ACTIVITY_* behavior
- [ ] Fragment internals: FragmentManager, back stack, commit variants, config change survival
- [ ] ViewModel and LiveData internals: ViewModelStore, LifecycleBoundObserver, postValue threading, HiltViewModelFactory
- [ ] RecyclerView internals: RecycledViewPool, ViewHolder, DiffUtil, ListAdapter, ItemAnimator, SnapHelper
- [ ] Coroutines: suspend, CPS transformation, CoroutineScope, structured concurrency, Dispatchers.Main, IO, Default
- [ ] Flow: cold flow, hot flow, StateFlow, SharedFlow
- [ ] Jetpack Compose: recomposition, remember, State<T>, compiler plugin, slot table, LayoutNode, ComposeView, AndroidView
- [ ] StrictMode: ThreadPolicy, VmPolicy, BlockGuard
- [ ] Memory leak topics: context leaks, static references, LeakCanary, WeakReference, ReferenceQueue
- [ ] Looper, Handler, MessageQueue: nativePollOnce, epoll_wait, IdleHandler, SyncBarrier, async messages, Choreographer link

## Week 3 - SystemServer and Core Framework Services
- [ ] SystemServer startup order and PHASE_* boot phases
- [ ] ActivityManagerService and ActivityTaskManagerService: ProcessRecord, ActivityRecord, Task, TaskRecord, WindowProcessController
- [ ] LRU process list and OOM adj calculation
- [ ] startActivity end-to-end flow
- [ ] Service lifecycle internals: started service, bound service, onBind, ServiceRecord, foreground service rules
- [ ] BroadcastReceiver internals: ordered, unordered, BroadcastRecord, BroadcastQueue fg/bg, PendingIntent security
- [ ] ContentProvider internals: IContentProvider, ContentProviderRecord, acquireProvider, CursorWindow, AbstractThreadedSyncAdapter
- [ ] AlarmManagerService: ELAPSED_REALTIME_WAKEUP, RTC_WAKEUP, doze alignment, setExactAndAllowWhileIdle
- [ ] JobSchedulerService and WorkManager internals: JobStore, constraint tracking, JobServiceContext
- [ ] NotificationManagerService: NotificationRecord, ranking, channels, NotificationListenerService callbacks, StatusBarManagerService bridge
- [ ] PowerManagerService: WakeLock API, IPowerManager, SuspendControlService, kernel wakelock path

## Week 4 - Binder IPC Deep Dive
- [ ] Why Binder exists vs pipes, sockets, shared memory, futexes, and signals
- [ ] Binder object model: IBinder, BBinder, BpBinder, BinderProxy, Stub, Proxy
- [ ] AIDL pipeline: .aidl, generated code, onTransact, transaction codes, in, out, inout, Parcelable
- [ ] Parcel internals: primitive layout, strings, Parcelable, file descriptors, IBinder references, writeStrongBinder path
- [ ] Binder transaction flow: BC_TRANSACTION, binder driver, BR_TRANSACTION, reply path, transaction buffer mapping
- [ ] ServiceManager: handle 0, context manager, addService, getService
- [ ] Binder thread pool: ProcessState, IPCThreadState, joinThreadPool, default thread count, thread starvation, deadlocks
- [ ] flat_binder_object, binder node/ref translation, strong refs, weak refs
- [ ] One-way vs two-way transactions, FLAG_ONEWAY, async Binder, reply parcels, error propagation
- [ ] Binder death notifications: linkToDeath, DeathRecipient, unlinkToDeath
- [ ] Binder shell tools: service list, service call, dumpsys
- [ ] Binder security: Binder.getCallingUid, checkCallingPermission, clearCallingIdentity, restoreCallingIdentity

## Week 5 - ART, Zygote, Class Loading, and JNI
- [ ] Dalvik vs ART
- [ ] Interpretation, JIT, AOT, quicken, speed, speed-profile
- [ ] dex2oat, .oat, .art, boot image, image space
- [ ] ART memory model: Java heap, native heap, Zygote space, image space, TLAB, large object space
- [ ] Garbage collection: generational GC, ConcurrentCopying, pause sources, JNI global refs, FinalizerReference
- [ ] Zygote internals: app_process, ZygoteInit, preload, zygote socket, fork, copy-on-write
- [ ] ClassLoader hierarchy: BootClassLoader, PathClassLoader, DexClassLoader, BaseDexClassLoader, split APK loaders
- [ ] Reflection, hidden APIs, @hide, greylist, blocklist
- [ ] Bionic libc vs glibc
- [ ] linker64, dlopen, shared library loading, linker namespace isolation
- [ ] NDK and JNI: JavaVM, JNIEnv, local refs, global refs, RegisterNatives, AttachCurrentThread, FindClass pitfalls

## Week 6 - Package, Process, Storage, and App Platform Dependencies
- [ ] PackageManagerService boot scan and package scanning
- [ ] Package parsing: AndroidManifest.xml, PackageParser, install flow, update flow, dexopt triggers
- [ ] Permission storage in /data/system
- [ ] Permission model evolution: install-time, runtime permissions, permission groups, one-time permissions, PermissionController
- [ ] URI grants, exported components, package visibility
- [ ] APK signature schemes v1, v2, v3, v4, apksig, lineage, signature verification in PMS
- [ ] UID-per-app sandbox, DAC vs MAC, app process importance states
- [ ] Memory pressure handling: LMKD, OOM killer, foreground/background process handling
- [ ] Room internals: SupportSQLiteDatabase, generated DAO, InvalidationTracker, migrations, Flow integration
- [ ] Retrofit and OkHttp internals: OkHttpClient, interceptor chain, ConnectionPool, CacheControl, CertificatePinner, platform network stack compatibility
- [ ] Hilt and Dagger: component hierarchy, @InstallIn, @Provides, @Binds, generated graph, @Singleton, @ViewModelScoped

## Week 7 - Input, Window Management, and Rendering Pipeline
- [ ] Input pipeline: kernel evdev, EventHub, InputReader, InputDispatcher, focused window, InputEventReceiver
- [ ] WindowManagerService: WindowState, WindowToken, DisplayContent, InputMonitor, insets management, Z-order
- [ ] SurfaceControl and SurfaceControl.Transaction
- [ ] SurfaceFlinger: Layer, HWComposer HWC2, composition strategy, GPU composition fallback
- [ ] BufferQueue: IGraphicBufferProducer, IGraphicBufferConsumer, dequeueBuffer, queueBuffer, acquireBuffer, releaseBuffer
- [ ] Triple buffering, latency, jank tradeoffs
- [ ] VSYNC, DispSync, Choreographer, frame deadline, missed VSYNC
- [ ] View pipeline: invalidate, scheduleTraversals, performTraversals, measure, layout, draw
- [ ] HWUI and RenderThread: RenderNode, DisplayList, SkiaRecordingCanvas, OpenGL ES, Vulkan
- [ ] Surface, SurfaceHolder, SurfaceView, TextureView, GLSurfaceView
- [ ] Atomic layer transactions: setPosition, setAlpha, setMatrix, setLayer

## Week 8 - Native Services, HAL, Properties, Logging, and Native Debugging
- [ ] init process and init.rc grammar: service, class, oneshot, trigger, on property, setprop
- [ ] Native Android processes: servicemanager, hwservicemanager, vndservicemanager, surfaceflinger, audioserver, cameraserver, mediaserver
- [ ] Property system: __system_property_get, __system_property_set, property_service, build.prop, default.prop, shared-memory-backed properties
- [ ] Property SELinux labeling and access control
- [ ] HAL evolution: legacy HAL, hw_module_t, HIDL, AIDL-for-HAL
- [ ] Treble: updateability motivation, system/vendor split, VINTF, manifest.xml, compatibility_matrix.xml
- [ ] HIDL details: hwbinder vs binder, passthrough vs binderized, generated code, IServiceManager
- [ ] AIDL-for-HAL details: @VintfStability, stability annotations, versioning
- [ ] logd and logging pipeline: android.util.Log, main/system/radio/events/crash buffers, logcat internals, Android logger history
- [ ] Native crash flow: debuggerd, crash_dump, tombstoned, tombstones, symbolication basics
- [ ] Tracing stack: kernel ftrace, atrace, systrace, Perfetto, memtrack

## Week 9 - Linux Kernel for Android
- [ ] Kernel boot sequence: decompression, start_kernel, rest_init, PID 1
- [ ] task_struct, process vs thread, kernel threads, kworkers
- [ ] Scheduler: CFS, nice, task priority, cgroups, cpuset, schedtune, uclamp
- [ ] Memory management: virtual memory, reclaim, page cache, zram, CMA
- [ ] Android memory evolution: lowmemorykiller, LMKD, ION, DMA-BUF heaps, ashmem, memfd
- [ ] Android kernel additions: binder driver, sync_file, logger, paranoid networking
- [ ] IPC primitives: pipes, Unix domain sockets, netlink, vsock, futexes, signals
- [ ] Binder driver internals: drivers/android/binder.c, binder_proc, binder_thread, binder_node, binder_ref, binder_transaction
- [ ] Power management: wakelocks, suspend/resume, cpuidle, cpufreq, schedutil, thermal zones, throttling
- [ ] File systems: ext4, f2fs, overlayfs, tmpfs, sdcardfs, FUSE
- [ ] Namespaces and cgroups in Android vs container use
- [ ] SELinux LSM hooks, policy load path, AVC denial flow
- [ ] Device Tree: DTS, DTSI, boot-time hardware description
- [ ] ioctl, sysfs, procfs, debugfs

## Week 10 - Android Security Architecture
- [ ] Android security model: sandbox, UID isolation, DAC, MAC
- [ ] SELinux policy layout: file_contexts, property_contexts, seapp_contexts, service_contexts, mac_permissions.xml, service.te, .te rules
- [ ] AVC denied workflow, neverallow rules, audit2allow pitfalls, CTS enforcement
- [ ] Binder service labeling and Binder service policy
- [ ] Permission enforcement paths: checkCallingPermission, enforceCallingPermission, URI grants
- [ ] Binder identity management bugs: clearCallingIdentity misuse
- [ ] Linux capabilities in Android: CAP_NET_ADMIN, CAP_SYS_ADMIN, init-granted capabilities
- [ ] seccomp-bpf policy and syscall filtering
- [ ] Keystore, KeystoreService, Keymaster, KeyMint, TEE, StrongBox, attestation
- [ ] Verified Boot, rollback protection, signature trust chain
- [ ] Knox-specific topics: RKP, TIMA, Knox Vault, Samsung enterprise security extensions

## Week 11 - Build System, Device Configuration, Partitions, and OTA
- [ ] Soong and Blueprint fundamentals
- [ ] Android.bp module types: cc_library, java_library, android_app, cc_defaults
- [ ] Android.mk legacy and Make plus Soong hybrid builds
- [ ] kati and Ninja build graph
- [ ] BoardConfig.mk, device.mk, vendorsetup.sh
- [ ] PRODUCT_PACKAGES, PRODUCT_COPY_FILES, TARGET_BOARD_PLATFORM
- [ ] Partition layout: system, vendor, product, system_ext, odm, data
- [ ] Dynamic partitions and super partition
- [ ] Treble boundaries and vendor interface ownership
- [ ] OTA system: update_engine, A/B OTA, virtual A/B, payload.bin, postinstall, rollback protection
- [ ] adbd architecture, USB vs TCP transport, adb shell PTY, run-as, adb root
- [ ] repo manifests, local manifests, repo sync, repo start
- [ ] OEM customization patterns and upstream overlay strategy

## Week 12 - End-to-End Tracing, Debugging, and Interview Synthesis
- [ ] End-to-end trace: app tap to Activity launch
- [ ] End-to-end trace: invalidate to pixel
- [ ] End-to-end trace: Binder call from app to system service to kernel and back
- [ ] End-to-end trace: input event from interrupt to app callback
- [ ] End-to-end trace: app install from APK parse to PMS to dexopt to launch
- [ ] End-to-end trace: native crash to tombstone to root cause
- [ ] End-to-end trace: jank investigation with dumpsys, logcat, Perfetto, FrameTimeline
- [ ] End-to-end trace: permission denial or SELinux denial to source and policy fix
- [ ] Shell and debug tools: dumpsys, service, cmd, logcat, bugreport, simpleperf, perfetto, atrace
- [ ] AOSP tracing drills: follow one API from app layer to framework to native to kernel
- [ ] Interview topics: tradeoffs, bottleneck analysis, thread starvation, deadlocks, memory pressure, startup, jank, security boundaries
- [ ] Interview answer pattern: symptom, owning layer, source path, instrumentation, likely root cause, validation
- [ ] Final revision topics: boot, Binder, ART, AMS, PMS, WMS, input, rendering, HAL, kernel, security, build, OTA