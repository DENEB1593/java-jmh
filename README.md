# JMH(Java Microbenchmark Harness)

### 환경설정
1. 의존성 추가
```xml
<dependencies>
  <dependency>
    <groupId>org.openjdk.jmh</groupId>
    <artifactId>jmh-core</artifactId>
    <version>${jmh.version}</version>
  </dependency>
  <dependency>
    <groupId>org.openjdk.jmh</groupId>
    <artifactId>jmh-generator-annprocess</artifactId>
    <version>${jmh.version}</version>
    <scope>provided</scope>
  </dependency>
</dependencies>
```

### 테스트 진행

## 실행
> mvn clean verify \
> java -jar target/benchmarks.jar \

## 참고
- [JMH Github](https://github.com/openjdk/jmh)