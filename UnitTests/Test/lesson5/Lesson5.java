package lesson5;

public class Lesson5 {
    //@JavaDispatcher.Container
//    private PostgreSQLContainer postgresqlContainer = new PostgreSQLContainer()
//            .withDatabaseName("foo")
//            .withUsername("foo")
//            .withPassword("secret");
//
//    @Test
//    void test() {
//        assertThat(postgresqlContainer.isRunning()).isTrue();
//    }
//
//    @Container
//    public static MockServerContainer mockServer = new MockServerContainer(
//            DockerImageName.parse("jamesdbloom/mockserver"));
//
//    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
//        TestPropertyValues.of(
//                "service-bank.base-url=http://" + mockServer.getContainerIpAddress() + ":" +
//                        mockServer.getFirstMappedPort()
//        ).applyTo(configurableApplicationContext.getEnvironment());
//    }
//
//
//    @Test
//    void getCitizenStatistic_forHelenZheludOK() {
//        new MockServerClient(mockServer.getHost(), mockServer.getServerPort())
//            .when(request()
//                .withPath("/fines/1"))
//                    .respond(response()
//                        .withBody("[]").withHeader(CONTENT_TYPE,
//                             APPLICATION_JSON_VALUE));
//        ResponseEntity<CitizenStatisticDto> entity = restTemplate.getForEntity("http://localhost:" + port +
//            "/citizens/98y783y7438uyegbkyg37yrg", CitizenStatisticDto.class);
//        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
//        assertThat(entity.getBody()).isNotNull();
//        assertThat(entity.getBody().finesTotal).isEqualTo(BigDecimal.ZERO);
//        }
//    }
}
