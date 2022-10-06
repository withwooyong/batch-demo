# batch-demo
# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.batch-demo' is invalid and this project uses 'com.example.batchdemo' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.4/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.4/gradle-plugin/reference/html/#build-image)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#howto.batch)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#data.sql)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#using.devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)

### Guides
The following guides illustrate how to use some features concretely:

* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

Spring Batch
===========
MySQL 정보 변경하고 실행 가능합니다.

### createArticleJob
> CSV 파일을 읽어서 DB 테이블에 데이터를 저장합니다.
> src/main/resources 내에 CSV 파일을 넣고 JobParameter로 해당 파일명을 기입하고 테스트 가능합니다.

### createBoardJob
> 여러 개의 CSV 파일을 읽어서 DB에 데이터를 저장합니다.
> 로컬 쓰레드를 이용한 파티셔닝 처리 샘플이며, 적절한 비즈니스 로직에 적용이 필요합니다.
> 하드코딩된 경로 변경하고 src/main/resources 내에 Boards.csv 파일을 여러 개 복사하여 해당 경로에 넣고 테스트 가능합니다.

### createOddBoardJob
> DB 테이블 데이터를 읽어서 처리한 후 다른 테이블에 데이터를 저장합니다.

### softDeleteBoardJob
> DB 테이블 삭제 대상 데이터를 읽은 후, 삭제 플래그를 변경하고 저장합니다.

### hardDeleteBoardJob
> DB 테이블 삭제 대상 데이터를 읽은 후, 백업 테이블에 데이터를 저장합니다.
> 백업 테이블에 데이터를 저장한 후에 데이터를 삭제합니다.****
