# 1. ビルド環境（Gradleのバージョンを少し下げて互換性を高めます）
FROM gradle:6.9.4-jdk8 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test --no-daemon

# 2. 実行環境
FROM eclipse-temurin:8-jre
EXPOSE 8080
COPY --from=build /home/gradle/src/build/libs/Skillcheck-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
