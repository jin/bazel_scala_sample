workspace(name = "basic_scala")

load(
    "@bazel_tools//tools/build_defs/repo:http.bzl",
    "http_archive",
)

rules_scala_version = "177e2eeb665899a0f116d20876c8c77b4ef27b98"  # update this as needed

http_archive(
    name = "io_bazel_rules_scala",
    strip_prefix = "rules_scala-%s" % rules_scala_version,
    type = "zip",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip" % rules_scala_version,
)

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")

scala_register_toolchains()

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories()

protobuf_version = "09745575a923640154bcf307fba8aedff47f240a"

protobuf_version_sha256 = "416212e14481cff8fd4849b1c1c1200a7f34808a54377e22d7447efdf54ad758"

http_archive(
    name = "com_google_protobuf",
    sha256 = protobuf_version_sha256,
    strip_prefix = "protobuf-%s" % protobuf_version,
    url = "https://github.com/protocolbuffers/protobuf/archive/%s.tar.gz" % protobuf_version,
)

# bazel-skylib 0.8.0 released 2019.03.20 (https://github.com/bazelbuild/bazel-skylib/releases/tag/0.8.0)
skylib_version = "0.8.0"

http_archive(
    name = "bazel_skylib",
    sha256 = "2ef429f5d7ce7111263289644d233707dba35e39696377ebab8b0bc701f7818e",
    type = "tar.gz",
    url = "https://github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib.{}.tar.gz".format(skylib_version, skylib_version),
)

load("@io_bazel_rules_scala//scala:scala_maven_import_external.bzl", "scala_maven_import_external")

scala_maven_import_external(
    name = "com_typesafe_akka_akka_http_2_12",
    artifact = "com.typesafe.akka:akka-http_2.12:10.1.4",
    fetch_sources = True,
    jar_sha256 = "9b8bdc14c3be4ac3f0032f664036a5d43d0c96c27bf693fba1fc5eeaf74d079b",
    licenses = ["notice"],
    server_urls = [
        "https://repo.maven.apache.org/maven2/",
    ],
    srcjar_sha256 = "55110c6acf0ddf5e1d19964d220a6823e928197009db3ee2bd62d4eb5ccecf24",
    deps = [
        "@com_typesafe_akka_akka_http_core_2_12//jar",
    ],
)

scala_maven_import_external(
    name = "com_typesafe_akka_akka_http_core_2_12",
    artifact = "com.typesafe.akka:akka-http-core_2.12:10.1.4",
    fetch_sources = True,
    jar_sha256 = "108f5d6ecb207921fd804eccec7da9853eb0011e540640ef45289cd7c3f1f26d",
    licenses = ["notice"],
    server_urls = [
        "https://repo.maven.apache.org/maven2/",
    ],
    srcjar_sha256 = "e532c4922c58c5c7ece0654694ea4d6f69cb732b5ca833d3466c360abdd82864",
    deps = [
        "@com_typesafe_akka_akka_parsing_2_12//jar",
    ],
)

scala_maven_import_external(
    name = "com_typesafe_akka_akka_parsing_2_12",
    artifact = "com.typesafe.akka:akka-parsing_2.12:10.1.4",
    fetch_sources = True,
    jar_sha256 = "d21165ea458ecd78bbb7a92cb2225c0a82e0f3f8c1a543224597b592985ef3c8",
    licenses = ["notice"],
    server_urls = [
        "https://repo.maven.apache.org/maven2/",
    ],
    srcjar_sha256 = "a1e3a7954195497a4f6acd938829a8abe3eba80dc947a2b86b412b70d51b5ab7",
    deps = [
    ],
)
