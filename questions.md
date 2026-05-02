# Android Framework / Platform Questions

Difficulty flags:
- [Basic] = definition-level, foundational, or first-pass interview question
- [Intermediate] = flow, component interaction, or applied platform understanding
- [Deep-dive] = internal implementation, tradeoff, debugging, or design-depth question

Original sourced questions are kept, with added difficulty flags.
The expected-question sections below are derived from the weekly topics and are meant as likely interview follow-ups.

## Week 1 - System Foundations and Android Stack Map

### Expected questions from this week
- [Intermediate] Explain the complete Android boot flow from power-on to the launcher becoming interactive.
- [Basic] What are the responsibilities of the bootloader, kernel, init, Zygote, SystemServer, and Launcher during boot?
- [Basic] Draw the Android stack and explain where apps, framework, ART, Binder, HAL, native services, and the kernel fit.
- [Basic] Why does Android use HALs instead of letting framework code talk to drivers directly?
- [Intermediate] Explain ARM exception levels EL0 to EL3 and where Android userspace, kernel, and Trusted OS execute.
- [Intermediate] What is TrustZone, and how does it relate to hardware-backed Android security?
- [Basic] What is the difference between userspace and kernelspace, and what happens during a syscall?
- [Intermediate] Explain virtual memory, page tables, page faults, and mmap in practical Android terms.
- [Intermediate] What is Android Verified Boot, and how does the secure boot chain establish trust?
- [Basic] What is inside an APK, and which parts matter at install time versus runtime?
- [Intermediate] What is DEX bytecode, and why did Android choose a register-based instruction model?

## Week 2 - App Process, Main Thread, and App-Layer Internals

### Expected questions from this week
- [Intermediate] Walk through app process startup from launcher tap to Application.onCreate and first Activity.onCreate.
- [Basic] What is the role of ActivityThread, and why does every app process have a main Looper?
- [Basic] What is ContextImpl, and how is it different from Application, Activity, and Service contexts?
- [Intermediate] How does the Activity launch path use Instrumentation and savedInstanceState Parcel flow?
- [Basic] How does Android resolve explicit and implicit intents, and where do IntentFilter rules apply?
- [Intermediate] How do FLAG_ACTIVITY_* behaviors affect task and back stack creation?
- [Intermediate] How does FragmentManager manage the back stack and survive configuration changes?
- [Intermediate] What problems do ViewModel and LiveData solve internally, and what are their lifecycle boundaries?
- [Intermediate] How does RecyclerView reuse views, and how do DiffUtil and ListAdapter reduce unnecessary work?
- [Deep-dive] How are suspend functions compiled, and how do Dispatchers.Main, IO, and Default map to execution behavior?
- [Intermediate] Compare Flow, StateFlow, and SharedFlow with respect to lifecycle and replay behavior.
- [Deep-dive] How does Compose recomposition work, and what role do the slot table and LayoutNode play?
- [Deep-dive] How do Looper, Handler, MessageQueue, Choreographer, and frame scheduling connect?

## Week 3 - SystemServer and Core Framework Services
- [Intermediate] [AOSP QnA (part-2) #28] How do system services register themselves with ServiceManager?
- [Deep-dive] [AOSP QnA (part-4) #52] How do you add a custom system service in Android?
- [Deep-dive] [AOSP QnA (part-4) #53] How do you modify framework JAR files?

### Expected questions from this week
- [Intermediate] Walk through SystemServer startup order and explain why boot phases matter.
- [Intermediate] What is the difference between ActivityManagerService and ActivityTaskManagerService?
- [Deep-dive] How are ProcessRecord, ActivityRecord, Task, and WindowProcessController related?
- [Deep-dive] How does Android maintain the LRU process list, and how is OOM adj calculated?
- [Deep-dive] Explain the end-to-end startActivity flow across app, AMS or ATMS, and the target process.
- [Intermediate] What is the difference between started, bound, and foreground services at the framework level?
- [Intermediate] How do ordered and unordered broadcasts differ in behavior, latency, and security impact?
- [Deep-dive] How does ContentProvider acquisition work, including acquireProvider and process startup implications?
- [Deep-dive] How do AlarmManagerService, JobSchedulerService, and WorkManager interact under Doze and app standby?
- [Deep-dive] How does WakeLock flow from app API through PowerManagerService down to kernel suspend behavior?

## Week 4 - Binder IPC Deep Dive
- [Basic] [AOSP QnA (part-2) #21] What is Binder in Android, and how does it work?
- [Intermediate] [AOSP QnA (part-2) #22] How does Binder inter-process communication (IPC) work?
- [Intermediate] [AOSP QnA (part-2) #24] How does Parcel work in Binder transactions?
- [Deep-dive] [AOSP QnA (part-2) #26] How does Android optimize Binder transactions?
- [Intermediate] [AOSP QnA (part-2) #27] What is ServiceManager, and how does it work?
- [Deep-dive] [AOSP QnA (part-2) #29] What are IBinder, IInterface, and BpBinder?

### Expected questions from this week
- [Intermediate] Why does Android use Binder instead of plain sockets, pipes, or shared memory APIs?
- [Deep-dive] Walk through the full Binder call path from an AIDL method call to binder driver handling and reply delivery.
- [Intermediate] What code is generated from an .aidl file, and what do Stub and Proxy actually do?
- [Deep-dive] What is a flat_binder_object, and how do binder node and binder ref translation work across processes?
- [Deep-dive] How does the Binder thread pool work, and what causes starvation or deadlocks?
- [Intermediate] What is the difference between one-way and two-way Binder transactions, and when should each be used?
- [Intermediate] How do linkToDeath and DeathRecipient work, and what problem do they solve?
- [Deep-dive] What is the Binder transaction size limit, and how would you redesign an API that hits it?
- [Deep-dive] Why can clearCallingIdentity misuse create security bugs in system services?
- [Intermediate] Which shell tools and traces would you use first to debug a slow or stuck Binder call?

## Week 5 - ART, Zygote, Class Loading, and JNI
- [Intermediate] [AOSP QnA (part-6) #76] How does Android optimize memory usage?

### Expected questions from this week
- [Basic] What are the major differences between Dalvik and ART?
- [Deep-dive] How do interpretation, JIT, AOT, quickening, and profile-guided compilation work together in ART?
- [Intermediate] What do dex2oat, .oat, .art, and the boot image do during app startup?
- [Deep-dive] Explain the Java heap, native heap, Zygote space, image space, TLAB, and large object space.
- [Intermediate] How does Zygote preloading improve startup time, and what role does copy-on-write play after fork?
- [Deep-dive] What are common GC pause sources in Android, and how do JNI global references worsen them?
- [Intermediate] Explain the ClassLoader hierarchy, including BootClassLoader, PathClassLoader, DexClassLoader, and split APK loading.
- [Intermediate] What are hidden APIs, and how do greylist and blocklist enforcement affect platform and app code?
- [Deep-dive] How is Bionic different from glibc, and why do linker namespaces matter on Android?
- [Intermediate] What are common JNI mistakes around local refs, global refs, AttachCurrentThread, and FindClass?

## Week 6 - Package, Process, Storage, and App Platform Dependencies
- [Basic] [AOSP 100 QnA (Revision part -3) #81] How does Android's permission model work?
- [Basic] [AOSP 100 QnA (Revision part -3) #85] How does Scoped Storage affect file access?

### Expected questions from this week
- [Deep-dive] How does PackageManagerService scan packages at boot, and what data does it persist under /data/system?
- [Intermediate] Walk through APK install flow from manifest parsing to signature verification to dexopt triggers.
- [Intermediate] How did the Android permission model evolve from install-time permissions to runtime permissions, roles, and one-time grants?
- [Deep-dive] What is the difference between runtime permissions, AppOps, URI grants, and exported component checks?
- [Intermediate] Compare APK signature schemes v1, v2, v3, and v4, and explain where lineage fits.
- [Intermediate] How does UID-per-app sandboxing work, and how do DAC and MAC combine in Android?
- [Deep-dive] How does LMKD decide which processes to kill under memory pressure?
- [Intermediate] How does Room use generated DAOs and InvalidationTracker under the hood?
- [Intermediate] How do OkHttp interceptors, connection pooling, and certificate pinning affect app-platform behavior?
- [Intermediate] How does Hilt or Dagger generate the component graph, and what do scopes like Singleton and ViewModelScoped control?

## Week 7 - Input, Window Management, and Rendering Pipeline
- [Deep-dive] [AOSP QnA (part-4) #51] How do you customize System UI in AOSP?
- [Deep-dive] [AOSP QnA (part-5) #62] How does gralloc HAL work in Android?
- [Intermediate] [AOSP QnA (part-5) #69] What is EGL (Embedded Graphics Library) in Android?

### Expected questions from this week
- [Deep-dive] Trace a touch event from kernel interrupt through EventHub, InputReader, InputDispatcher, and into app callbacks.
- [Deep-dive] How does WindowManagerService decide the focused window and coordinate input dispatch?
- [Deep-dive] What are WindowState, WindowToken, DisplayContent, and InputMonitor responsible for?
- [Deep-dive] How does BufferQueue work, and what are the producer and consumer sides doing?
- [Intermediate] What problem does SurfaceControl.Transaction solve, and why are atomic layer updates important?
- [Deep-dive] How does SurfaceFlinger choose between HWC2 composition and GPU composition fallback?
- [Intermediate] Explain VSYNC, Choreographer, frame deadlines, and how missed deadlines cause jank.
- [Intermediate] Compare SurfaceView, TextureView, and GLSurfaceView from a rendering-pipeline perspective.
- [Deep-dive] What roles do HWUI, RenderThread, RenderNode, and Skia play in the modern rendering pipeline?

## Week 8 - Native Services, HAL, Properties, Logging, and Native Debugging
- [Intermediate] [AOSP QnA (part-2) #23] What is the difference between AIDL and HIDL?
- [Intermediate] [AOSP QnA (part-4) #55] How does HIDL enable hardware abstraction in Android?
- [Deep-dive] [AOSP QnA (part-4) #56] How do you implement a custom HAL interface?
- [Deep-dive] [AOSP QnA (part-4) #57] How do you debug HAL modules in Android?
- [Intermediate] [AOSP QnA (part-4) #58] What is the difference between HIDL and AIDL?
- [Deep-dive] [AOSP QnA (part-4) #60] How do you update an existing HAL interface?
- [Intermediate] [AOSP QnA (part-5) #61] What is libhardware in AOSP?
- [Intermediate] [AOSP QnA (part-5) #63] What is Binderized HAL?
- [Deep-dive] [AOSP QnA (part-5) #64] How does Camera HAL work?
- [Deep-dive] [AOSP QnA (part-5) #65] How does the Audio HAL work in Android?
- [Deep-dive] [AOSP QnA (part-5) #66] How do you modify Phone services (RIL) in AOSP?
- [Intermediate] [AOSP QnA (part-5) #67] What is Health HAL, and what does it monitor?
- [Deep-dive] [AOSP QnA (part-5) #68] How does Wi-Fi HAL work in Android?
- [Deep-dive] [AOSP QnA (part-5) #70] How do you build a vendor-specific HAL in AOSP?
- [Deep-dive] [AOSP 100 QnA (Revision part -3) #99] How do you debug init failures in AOSP?

### Expected questions from this week
- [Deep-dive] How does init parse init.rc files, triggers, and service classes during boot?
- [Intermediate] What is the difference between servicemanager, hwservicemanager, and vndservicemanager?
- [Intermediate] How does the Android property system store and propagate properties across processes?
- [Deep-dive] How do property_contexts and SELinux labeling control who can read or write a property?
- [Intermediate] Compare legacy HAL, HIDL HAL, and AIDL-for-HAL from architecture and maintenance perspectives.
- [Intermediate] What problem did Treble solve, and how do VINTF manifests and compatibility matrices enforce boundaries?
- [Intermediate] What is the difference between passthrough and binderized HALs, and why did Android move away from passthrough?
- [Intermediate] How does the logging stack work from android.util.Log to logd buffers and logcat output?
- [Deep-dive] Walk through the native crash path involving debuggerd, crash_dump, tombstoned, and tombstones.
- [Deep-dive] When would you choose ftrace, atrace, systrace, Perfetto, or tombstone analysis for a native issue?

## Week 9 - Linux Kernel for Android
- [Intermediate] [AOSP QnA (part-2) #25] What is the Binder driver, and where is it implemented?
- [Deep-dive] [AOSP QnA (part-6) #79] How do you enable ftrace for debugging kernel events?

### Expected questions from this week
- [Intermediate] Explain the Linux kernel boot sequence up to rest_init and PID 1.
- [Intermediate] What is task_struct, and how do Linux processes, threads, kernel threads, and kworkers relate?
- [Deep-dive] How do CFS, cgroups, cpusets, schedtune, and uclamp affect Android task scheduling?
- [Deep-dive] Explain reclaim, page cache, zram, and CMA from an Android memory-management perspective.
- [Deep-dive] Compare lowmemorykiller, LMKD, ION, DMA-BUF heaps, ashmem, and memfd in Android's evolution.
- [Deep-dive] Walk through the major Binder driver structures such as binder_proc, binder_thread, binder_node, binder_ref, and binder_transaction.
- [Deep-dive] How do wakelocks, suspend or resume, cpuidle, cpufreq, and thermal throttling interact?
- [Intermediate] What role does Device Tree play in Android bring-up and hardware description?
- [Intermediate] When would you inspect sysfs, procfs, debugfs, or ioctl paths while debugging kernel-facing issues?

## Week 10 - Android Security Architecture
- [Basic] [AOSP 100 QnA (Revision part -3) #82] What is SELinux, and how does it enhance Android security?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #83] What are capabilities in Linux, and how does Android use them?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #84] How does File-Based Encryption (FBE) work in Android?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #86] What is dm-verity, and how does it protect system integrity?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #87] What is the keystore system, and how does it work?
- [Deep-dive] [AOSP 100 QnA (Revision part -3) #88] How do you add a custom security policy in AOSP?
- [Deep-dive] [AOSP 100 QnA (Revision part -3) #89] How does Android's attestation framework work?
- [Deep-dive] [AOSP 100 QnA (Revision part -3) #90] How do you analyze security vulnerabilities in AOSP?

### Expected questions from this week
- [Intermediate] Explain Android's layered security model using sandboxing, UID isolation, DAC, MAC, and SELinux.
- [Deep-dive] What files make up Android SELinux policy layout, and what does each one control?
- [Deep-dive] What are neverallow rules, and why is blindly using audit2allow dangerous?
- [Deep-dive] How are Binder services labeled and protected at the SELinux and permission-enforcement layers?
- [Deep-dive] Why is clearCallingIdentity misuse a common source of security bugs in system services?
- [Intermediate] How do Linux capabilities reduce attack surface compared with granting full root?
- [Deep-dive] What is seccomp-bpf, and where does syscall filtering matter on Android?
- [Deep-dive] Explain the relationship among Keystore, Keymaster or KeyMint, TEE, StrongBox, and attestation.
- [Intermediate] How do Verified Boot and rollback protection enforce trust across updates?
- [Deep-dive] What extra enterprise security concepts such as Knox Vault, TIMA, or RKP might appear in OEM interviews?

## Week 11 - Build System, Device Configuration, Partitions, and OTA
- [Deep-dive] [AOSP QnA (part-4) #54] How do you add a new device configuration in AOSP?
- [Deep-dive] [AOSP QnA (part-4) #59] How do you port a new device to AOSP?
- [Basic] [AOSP 100 QnA (Revision part -3) #91] What is the structure of the Android build system?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #92] How does Soong work in Android?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #93] How do you add a new module to AOSP?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #94] How do you modify a system app in AOSP?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #95] How does OTA updates work in Android?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #96] How do you apply security patches in AOSP?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #97] What are the common build issues in AOSP, and how do you resolve them?
- [Deep-dive] [AOSP 100 QnA (Revision part -3) #98] How do you integrate a new kernel into an AOSP build?
- [Intermediate] [AOSP 100 QnA (Revision part -3) #100] How does Recovery Mode work in Android?

### Expected questions from this week
- [Deep-dive] Walk through the Soong, Blueprint, Kati, and Ninja pipeline from Android.bp to final artifacts.
- [Intermediate] What is the practical difference between Android.bp and Android.mk, and why do hybrid builds still exist?
- [Intermediate] Compare common module types such as cc_library, java_library, android_app, and cc_defaults.
- [Intermediate] What do BoardConfig.mk, device.mk, product makefiles, and vendorsetup.sh each control?
- [Intermediate] How do PRODUCT_PACKAGES, PRODUCT_COPY_FILES, and TARGET_BOARD_PLATFORM affect a device build?
- [Intermediate] Explain partition ownership across system, vendor, product, system_ext, odm, and data.
- [Intermediate] What are dynamic partitions and the super partition, and why were they introduced?
- [Deep-dive] Compare classic A/B OTA and virtual A/B OTA, including update_engine, payload.bin, and rollback behavior.
- [Deep-dive] How does adbd differ between USB and TCP transport, and what do adb root and run-as actually change?
- [Intermediate] How do repo manifests and local manifests help manage multi-repo platform development?
- [Deep-dive] What are safe OEM customization patterns that reduce long-term merge pain with upstream AOSP?

## Week 12 - End-to-End Tracing, Debugging, and Interview Synthesis
- [Intermediate] [AOSP QnA (part-2) #30] How can we monitor Binder transactions in Android?
- [Intermediate] [AOSP QnA (part-6) #71] How do you use strace to debug Android system processes?
- [Deep-dive] [AOSP QnA (part-6) #72] How do you profile an Android system service?
- [Intermediate] [AOSP QnA (part-6) #73] What is systrace, and how do you use it?
- [Intermediate] [AOSP QnA (part-6) #74] How do you analyze logcat logs efficiently?
- [Intermediate] [AOSP QnA (part-6) #75] What is dumpsys, and how can it help debug system services?
- [Intermediate] [AOSP QnA (part-6) #77] How do you measure boot time performance in Android?
- [Intermediate] [AOSP QnA (part-6) #78] What is perfetto, and how is it used?
- [Deep-dive] [AOSP QnA (part-6) #80] How do you debug Binder IPC issues in Android?

### Expected questions from this week
- [Deep-dive] Trace an app tap to Activity launch and identify the owning layer at each stage.
- [Deep-dive] Trace invalidate to pixel and explain where latency can accumulate.
- [Deep-dive] Trace a Binder call from app code through framework, native, kernel driver, and back.
- [Deep-dive] Trace app install from APK parsing through PackageManager, dexopt, and first launch.
- [Deep-dive] Trace a native crash from symptom to tombstone to likely root cause.
- [Deep-dive] How would you investigate jank using dumpsys, logcat, Perfetto, FrameTimeline, and app traces together?
- [Deep-dive] How would you debug a permission denial or SELinux denial from symptom to exact enforcement point and fix?
- [Intermediate] When answering an interview question, how do you structure the answer around symptom, owning layer, source path, instrumentation, likely root cause, and validation?
- [Intermediate] If you do not know whether a problem is in app, framework, native, HAL, or kernel, what is your first discriminating check?
- [Intermediate] What cross-layer bottlenecks most often appear in platform interviews: thread starvation, lock contention, Binder backlog, memory pressure, startup cost, or rendering delays?