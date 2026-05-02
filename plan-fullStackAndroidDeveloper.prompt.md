# Full Stack Android Developer Roadmap (Kotlin A2Z)

You are currently at **20% of Kotlin basics** (K001–K005 done). This roadmap takes you from where you are now all the way to a production-ready full-stack Android developer — covering Kotlin language mastery, Android frontend, backend APIs, databases, and deployment.

---

## 📌 PHASE 1 — Kotlin Language Mastery (You are here → K001–K020)

*Complete your existing `K001`–`K020` roadmap in this repo, then go deeper:*

### Basics *(K001–K005 ✅ Done)*
- Hello World
- Variables (`var` / `val`)
- Data Types (`Int`, `String`, `Boolean`, `Double`, `Long`, `Char`, `Float`)
- Operators (Arithmetic, Logical, Comparison, Bitwise, Range, Elvis, Safe Call)

### Control Flow *(K006–K010)*
- `if / else` as expression
- `when` as switch/expression
- `for` loops and ranges (`..`, `until`, `downTo`, `step`)
- `while` and `do-while`
- `break`, `continue`, labeled returns
- Functions — declaration, default params, named args, single-expression functions

### Functions & Collections *(K011–K015)*
- Extension Functions
- Higher-Order Functions
- Lambda Expressions & anonymous functions
- Collections — `Array`, `List` (mutable/immutable)
- Collections — `Map`, `Set`, collection operators (`map`, `filter`, `reduce`, `fold`, `groupBy`, `flatMap`)

### OOP *(K016–K020)*
- Classes, constructors (primary & secondary), `init` block
- Inheritance, `open` keyword, `override`
- Data Classes, `copy()`, `componentN()`
- Sealed Classes, `object` declarations, Companion Objects
- Interfaces, abstract classes, multiple interface implementation
- Exception Handling — `try/catch/finally`, custom exceptions, `runCatching`

### Advanced Kotlin *(K021–K035 — new files to add)*
- Generics — `<T>`, variance (`in`/`out`), type constraints
- Delegation — `by` keyword, `Delegates.observable`, `Delegates.lazy`
- Enum Classes with properties and methods
- `Inline` functions and `crossinline` / `noinline`
- `Reified` type parameters
- Operator Overloading
- DSL Builders — `apply`, `also`, `let`, `run`, `with`, custom DSLs
- Destructuring declarations
- Reflection basics — `KClass`, `KProperty`
- Annotations

### Kotlin Coroutines & Concurrency *(K036–K045)*
- `suspend` functions
- `CoroutineScope`, `GlobalScope`
- `launch` vs `async / await`
- `Deferred<T>`, structured concurrency
- `Dispatchers` — `Main`, `IO`, `Default`, `Unconfined`
- `withContext`
- `Flow` — cold streams, operators (`map`, `filter`, `collect`, `combine`, `zip`)
- `StateFlow` and `SharedFlow`
- `Channel` — producer/consumer pattern
- Exception handling in coroutines — `CoroutineExceptionHandler`, `SupervisorJob`
- Cancellation and timeouts

### Kotlin Multiplatform (KMP) Basics
- Shared code concept
- `expect` / `actual` declarations
- KMP project structure

---

## 📌 PHASE 2 — Android Frontend (UI Layer)

### Android Studio & Project Setup
- Android Studio setup and IDE navigation
- Project structure — `app/`, `res/`, `manifests/`, `kotlin+java/`
- `AndroidManifest.xml` — Activities, permissions, intent filters
- `build.gradle` (Kotlin DSL) — dependencies, `compileSdk`, `minSdk`, `buildTypes`
- Gradle sync, build variants, product flavors

### XML-based UI *(Legacy but required knowledge)*
- `Activity` lifecycle — `onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`
- `Fragment` lifecycle and `FragmentManager`
- Views — `TextView`, `EditText`, `Button`, `ImageView`, `CheckBox`, `RadioButton`, `Spinner`
- ViewGroups — `ConstraintLayout`, `LinearLayout`, `FrameLayout`, `RelativeLayout`
- `RecyclerView` + `Adapter` + `DiffUtil` + `ListAdapter`
- `ScrollView`, `NestedScrollView`
- Resources — `strings.xml`, `colors.xml`, `dimens.xml`, `styles.xml`, `themes.xml`
- Menus, Toolbars, `ActionBar`
- Dialogs — `AlertDialog`, `BottomSheetDialog`, custom dialogs
- `ViewBinding` (preferred over `findViewById`)

### Jetpack Compose *(Modern UI — primary focus)*
- Composable functions and the Compose mental model
- `State` and `remember`, `mutableStateOf`
- `LaunchedEffect`, `SideEffect`, `DisposableEffect`
- Layouts — `Column`, `Row`, `Box`, `LazyColumn`, `LazyRow`, `LazyGrid`
- `Scaffold`, `TopAppBar`, `BottomAppBar`, `FloatingActionButton`
- `Material3` design system — Typography, Colors, Shapes, `MaterialTheme`
- `Modifier` — padding, size, clickable, background, clip, etc.
- Text, TextField, Button, Image, Icon composables
- Navigation in Compose — `NavController`, `NavHost`, `composable` destinations
- Animations — `AnimatedVisibility`, `animateColorAsState`, `Transition`, `AnimatedContent`
- `ViewModel` integration with Compose
- Custom composables and reusability
- CompositionLocal
- Canvas and custom drawing

### Navigation
- Jetpack Navigation Component
- `NavGraph`, `NavController`, `NavBackStackEntry`
- Deep Links
- Bottom Navigation Bar
  - Navigation with arguments (Safe Args / type-safe routes)
- Nested navigation graphs

### Android Lifecycle & Jetpack Architecture Components
- `ViewModel` — survivng configuration changes
- `LiveData` — observing data changes
- `StateFlow` / `SharedFlow` in ViewModel
- `SavedStateHandle`
- `Lifecycle-aware` components
- `DataBinding` (legacy, but good to know)

### Dependency Injection
- Manual DI (constructor injection) — understand the concept first
- **Hilt** (primary, recommended) — `@HiltAndroidApp`, `@AndroidEntryPoint`, `@HiltViewModel`, `@Inject`, `@Module`, `@Provides`, `@Binds`, scoped bindings
- **Koin** (lightweight alternative) — `startKoin`, `module {}`, `inject()`, `viewModel {}`
- **Dagger2** (advanced, for large enterprise projects)

### Local Storage
- `SharedPreferences` (legacy)
- **DataStore** — `Preferences DataStore`, `Proto DataStore`
- **Room Database** — `@Entity`, `@Dao`, `@Database`, `@Query`, `@Insert`, `@Update`, `@Delete`, migrations, type converters, `Flow` from Room

### Media & Sensors
- Camera — `CameraX` API
- Gallery / File Picker — `ActivityResultContracts`
- Runtime Permissions — `rememberLauncherForActivityResult`
- `MediaPlayer` / `ExoPlayer` for audio/video
- Location & Maps — Google Maps SDK, `FusedLocationProviderClient`
- Sensors — accelerometer, gyroscope

---

## 📌 PHASE 3 — Networking & API Integration

### REST API with Retrofit
- `Retrofit2` setup and interface definition
- `OkHttp` client — interceptors, logging, timeouts
- `kotlinx.serialization` (recommended) / `Gson` / `Moshi`
- Handling responses — `Response<T>`, error bodies
- Coroutines with Retrofit — `suspend` functions
- Repository pattern with `Result<T>` sealed class
- SSL Pinning

### Kotlin Flow with Networking
- Wrapping API calls in `Flow`
- `callbackFlow` for callback-based APIs
- Error handling with `catch` operator
- `Resource<T>` / `NetworkResult<T>` pattern — Loading, Success, Error states

### GraphQL
- Apollo Kotlin client setup
- Writing `.graphql` query/mutation files
- Code generation
- Subscriptions (real-time)

### WebSockets & Real-time
- OkHttp WebSocket
- Firebase Realtime Database
- Firebase Cloud Messaging (FCM) — Push Notifications
- Notification channels, custom notification layouts

### Authentication
- Firebase Authentication — Email/Password, Google Sign-In, Phone OTP
- JWT tokens — storing securely with `EncryptedSharedPreferences`
- OAuth2 flow
- Token refresh strategy with OkHttp `Authenticator`
- Biometric authentication — `BiometricPrompt`

---

## 📌 PHASE 4 — Android Architecture & Best Practices

### Architecture Patterns (in order of evolution)
- **MVC** — Model View Controller (understand the problem it solves)
- **MVP** — Model View Presenter
- **MVVM** — Model View ViewModel (most common in Android)
- **MVI** — Model View Intent / Unidirectional Data Flow (best with Compose)

### Clean Architecture
- **Presentation Layer** — UI (Composables/Activities), ViewModel, UI State
- **Domain Layer** — `UseCase` classes, Repository interfaces, Domain models
- **Data Layer** — Repository implementations, Remote data source, Local data source, Mappers
- Dependency rule — inner layers don't know outer layers
- Benefits — testability, scalability, separation of concerns

### Modularization
- Why modularize? (build speed, separation, reuse)
- Module types — `:app`, `:core:ui`, `:core:network`, `:core:data`, `:core:domain`, `:feature:home`, `:feature:profile`
- Inter-module navigation
- Convention plugins with `build-logic` module
- `libs.versions.toml` (Version Catalog)

### Testing
- **Unit Testing** — `JUnit5`, `MockK`, `Turbine` (for Flow), `kotlinx-coroutines-test`
- **Integration Testing** — Room in-memory database, Hilt testing
- **UI Testing** — Espresso (XML), Compose Testing (`createComposeRule`)
- Test doubles — Mock, Stub, Fake, Spy
- TDD (Test-Driven Development) basics
- Code coverage with JaCoCo

### WorkManager & Background Tasks
- `WorkManager` — `Worker`, `CoroutineWorker`, `OneTimeWorkRequest`, `PeriodicWorkRequest`, `Constraints`, chaining
- `AlarmManager`
- Foreground services

---

## 📌 PHASE 5 — Backend Development (Server-Side Kotlin)

### Ktor Framework *(Kotlin-native, start here)*
- Project setup with `ktor-server-netty`
- Routing — `get`, `post`, `put`, `delete`
- Request handling — path params, query params, request body
- Plugins — `ContentNegotiation`, `kotlinx.serialization`, `Authentication`, `Sessions`, `CORS`, `CallLogging`, `StatusPages`
- JWT Authentication plugin
- WebSockets
- Static content serving
- Structuring a Ktor project (routes, services, repositories)

### Spring Boot with Kotlin *(Industry standard)*
- Project setup with Spring Initializr
- `@RestController`, `@GetMapping`, `@PostMapping`, `@RequestBody`, `@PathVariable`
- `@Service`, `@Repository`, `@Component` — bean management
- `@Autowired` vs constructor injection
- Spring Data JPA — `JpaRepository`, `CrudRepository`, JPQL queries
- `@Entity`, `@Table`, `@Column`, `@OneToMany`, `@ManyToOne`
- Spring Security — filter chain, `UserDetailsService`, password encoding
- Exception handling — `@ControllerAdvice`, `@ExceptionHandler`
- Application properties / YAML config
- Profiles — `dev`, `staging`, `prod`
- Coroutines with Spring Boot (Spring WebFlux for reactive approach)

### Database — Backend
- **PostgreSQL** — relational DB, SQL fundamentals (JOINs, indexes, transactions)
- **Exposed ORM** (Kotlin-native) — `Table`, DSL queries, DAO pattern
- **Hibernate / JPA** with Spring Boot
- **MongoDB** with `KMongo` or Spring Data MongoDB — documents, collections, aggregation
- **Redis** — caching, session storage, pub/sub

### API Design Best Practices
- RESTful principles — resources, HTTP verbs, statelessness
- HTTP status codes (200, 201, 400, 401, 403, 404, 422, 500)
- API versioning (`/v1/`, `/v2/`)
- Pagination — cursor-based, offset-based
- Filtering, sorting, searching
- `OpenAPI` / `Swagger` documentation
- Rate limiting and throttling
- HATEOAS (awareness level)

### Security — Backend
- JWT generation and validation (`java-jwt` / `jjwt`)
- Password hashing with `bcrypt`
- HTTPS / TLS
- CORS configuration
- CSRF protection
- Input validation and sanitization
- `@Valid` with Bean Validation (Jakarta Validation)
- SQL injection prevention
- Secrets management — environment variables, `.env`, Vault

### File Storage
- AWS S3 — `aws-sdk-kotlin`, upload, download, presigned URLs
- Firebase Storage
- Cloudinary (image transformations)

### Background Jobs & Messaging
- Kotlin Coroutines for async tasks on server
- Scheduled tasks — `@Scheduled` (Spring) / Ktor scheduled tasks
- **Apache Kafka** basics — producer, consumer, topics, partitions (event-driven intro)
- **RabbitMQ** basics (alternative to Kafka for simpler use cases)

---

## 📌 PHASE 6 — Firebase & Cloud Services

### Firebase Suite
- **Firestore** — collections, documents, real-time listeners, security rules
- **Realtime Database** — JSON tree, offline support
- **Firebase Auth** — multiple providers
- **Firebase Storage** — upload/download files
- **Firebase Analytics** — events, user properties
- **Firebase Crashlytics** — crash reporting, ANRs
- **Remote Config** — A/B testing, feature flags
- **App Distribution** — beta testing
- **Performance Monitoring**

### Google Cloud Platform (GCP)
- **Cloud Run** — deploying containerized Ktor/Spring Boot backend (serverless)
- **Cloud Functions** — event-driven serverless functions in Kotlin
- **App Engine** — managed platform
- **Cloud SQL** — managed PostgreSQL
- **Cloud Storage** — object storage
- **Pub/Sub** — messaging service

### AWS Basics
- **EC2** — virtual servers
- **RDS** — managed relational databases
- **S3** — object storage
- **Lambda** — serverless functions
- **API Gateway** — managed API routing
- **Elastic Beanstalk** — deploy Spring Boot apps

---

## 📌 PHASE 7 — DevOps, CI/CD & Deployment

### Git & Version Control
- Git fundamentals — commit, branch, merge, rebase
- Branching strategy — Git Flow, GitHub Flow, trunk-based
- Pull requests, code reviews
- Conventional commits
- `.gitignore` for Android and Kotlin projects

### CI/CD for Android
- **GitHub Actions** — workflows, jobs, steps for Android
- Build APK/AAB in CI
- Run unit tests and UI tests in CI
- Code quality — `ktlint`, `detekt`
- **Fastlane** — automated lane for build, test, deploy
- **Firebase App Distribution** via CI
- Automated Play Store deployment with Fastlane / GitHub Actions

### CI/CD for Backend
- **Docker** — `Dockerfile` for Ktor / Spring Boot, multi-stage builds
- `docker-compose` — local development with DB + app + cache
- Container registry — Docker Hub / GCR / ECR
- Deploy to **Railway** / **Render** (easy start)
- Deploy to **GCP Cloud Run** / **AWS ECS** (production)
- Environment variable management in CI/CD secrets

### Google Play Store
- App signing — keystore generation, signing config in Gradle
- AAB (Android App Bundle) vs APK
- Play Console — internal track → alpha → beta → production
- Staged rollouts
- Store listing — screenshots, feature graphic, description
- In-App Purchases — Google Billing Library v6
- Play Integrity API (app safety check)

### Monitoring & Observability
- **Firebase Crashlytics** — crash-free users, non-fatals
- **Firebase Performance Monitoring**
- **Sentry** — error tracking for Android and backend
- **Timber** — Android logging library
- Backend logging — `Logback` + `SLF4J`
- Health check endpoints

---

## 📌 PHASE 8 — Advanced & Specialization Topics

### Performance Optimization — Android
- Android Profiler — CPU, Memory, Network
- **Baseline Profiles** — ahead-of-time compilation hints
- **Macrobenchmark** library
- R8 / ProGuard — code shrinking, obfuscation, optimization
- `App Startup` library — reduce startup time
- Memory leaks — `LeakCanary`
- Image loading optimization — `Coil` (Kotlin-first), `Glide`
- Compose performance — `derivedStateOf`, `key()`, `@Stable`, avoiding unnecessary recompositions

### Accessibility & Localization
- TalkBack support — `contentDescription`, `semantics`
- Minimum touch target sizes
- Color contrast
- `strings.xml` translations, `plurals`
- RTL layout support — `start`/`end` vs `left`/`right`
- Multi-language switching at runtime

### Kotlin Multiplatform Mobile (KMM)
- KMM project structure — `shared`, `androidApp`, `iosApp`
- `expect` / `actual` for platform-specific implementations
- Sharing `ViewModel`, `UseCase`, Repository, networking
- `SQLDelight` for cross-platform local DB
- `Ktor` as shared networking client
- Publishing shared library

### Wear OS
- Wear OS project setup
- Compose for Wear OS
- Complications, Tiles, Watch Faces

### Android TV & Large Screen
- `Leanback` library
- `TvLazyColumn`, focus management
- Adaptive layouts — `WindowSizeClass`, multi-pane layouts (`ListDetailPaneScaffold`)
- Foldables support

### Machine Learning on Device
- **ML Kit** — text recognition, face detection, barcode scanning, language detection
- **TensorFlow Lite** — custom model inference on Android
- **MediaPipe** — on-device AI pipelines
- **Google AI Edge** / Gemini Nano on-device (latest)

### Bluetooth & IoT
- Bluetooth Classic — `BluetoothAdapter`, `BluetoothSocket`
- **BLE (Bluetooth Low Energy)** — GATT, services, characteristics, scanning
- NFC — reading/writing NFC tags, `IsoDep`

---

## 🗺️ Suggested Learning Path Timeline

| Phase | Duration | Focus |
|---|---|---|
| Phase 1 — Kotlin Mastery | 4–6 weeks | Finish K001–K045 in this repo |
| Phase 2 — Android Frontend | 6–8 weeks | XML + Jetpack Compose UI |
| Phase 3 — Networking | 2–3 weeks | Retrofit, Firebase, Auth |
| Phase 4 — Architecture | 3–4 weeks | Clean Arch, MVI, Testing |
| Phase 5 — Backend | 6–8 weeks | Ktor + Spring Boot + DB |
| Phase 6 — Cloud | 2 weeks | Firebase + GCP/AWS |
| Phase 7 — DevOps | 2 weeks | CI/CD + Play Store |
| Phase 8 — Advanced | Ongoing | Specialization & KMM |

**Total estimated time:** ~6–9 months of consistent daily study (2–4 hrs/day)

---

## 📚 Recommended Resources

### Kotlin
- [Kotlin Official Docs](https://kotlinlang.org/docs/home.html)
- [Kotlin Koans](https://play.kotlinlang.org/koans) — interactive exercises
- Book: *Kotlin in Action* (Jemerov & Isakova)

### Android
- [Android Developers Official](https://developer.android.com)
- [Now in Android](https://github.com/android/nowinandroid) — official architecture sample
- [Jetpack Compose samples](https://github.com/android/compose-samples)
- YouTube: Philipp Lackner (Android + Kotlin), Android Developers channel

### Backend
- [Ktor Official Docs](https://ktor.io/docs)
- [Spring Boot + Kotlin guide](https://spring.io/guides/tutorials/spring-boot-kotlin/)
- Book: *Spring Boot in Practice*

### Architecture
- [Guide to app architecture](https://developer.android.com/topic/architecture)
- [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html) — Uncle Bob

---

## 🎯 Capstone Project Ideas (Build these to solidify learning)

| # | Project | Covers |
|---|---------|--------|
| 1 | **Notes App** | Compose UI, Room, MVVM, Hilt |
| 2 | **Weather App** | Retrofit, Coroutines, Location, Clean Arch |
| 3 | **Chat App** | Firebase, WebSocket, FCM, Auth |
| 4 | **E-Commerce App** | Full-stack — Ktor backend + Android app, JWT auth, Stripe payments |
| 5 | **Fitness Tracker** | Sensors, WorkManager, Room, Charts, Wear OS |
| 6 | **Social Media App** | Full-stack — Spring Boot + PostgreSQL + Android, image upload, real-time feed |

---

## ✅ Current Progress

- ✅ K001 — Hello World
- ✅ K002 — Add Two Numbers
- ✅ K003 — Variables (var / val)
- ⏳ K004 — Data Types
- ✅ K005 — Operators
- ⏳ K006–K045 — Everything above

---

**Last Updated:** May 2, 2026

