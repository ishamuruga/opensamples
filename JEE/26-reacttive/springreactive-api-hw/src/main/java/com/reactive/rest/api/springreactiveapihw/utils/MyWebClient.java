package com.reactive.rest.api.springreactiveapihw.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.reactive.rest.api.springreactiveapihw.model.AddStudent;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import ch.qos.logback.core.net.SyslogOutputStream;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public class MyWebClient {
  private WebClient client = WebClient.create("http://localhost:8080");

  private Mono<ClientResponse> result = client.get().uri("/api/student").accept(MediaType.APPLICATION_JSON).exchange();

  public AddStudent getResult() {
    return result.flatMap(res -> res.bodyToMono(AddStudent.class)).block();
  }

  public void doLogit() {
    System.out.println("====================================doLogit");
    Mono<AddStudent> response = client.get().uri("/api/student")
                                .accept(MediaType.APPLICATION_JSON)
                                .retrieve()
                                .bodyToMono(AddStudent.class).log();
    AddStudent stu = response.block();
    System.out.println("==================" + stu);
  }


  public void doLogits() {
    System.out.println("====================================doLogit");
    Mono<AddStudent[]> response = client.get().uri("/api/students")
                                .accept(MediaType.APPLICATION_JSON)
                                .retrieve()
                                .bodyToMono(AddStudent[].class).log();
    AddStudent[] stu = response.block();
    System.out.println("==================" + stu);

    List<AddStudent> listStu = Arrays.stream(stu).collect(Collectors.toList());
    listStu.forEach(System.out::println);
    System.out.println("==================");
  }

  public void fstudents(){
    System.out.println("====================================fstudents");
    Flux<AddStudent> stuFlux = client.get().uri("/api/fstudents")
                          .retrieve()
                          .bodyToFlux(AddStudent.class);
    //stuFlux.filter(stu -> stu.getId()==9990).subscribe(System.out::println);
    stuFlux.subscribe(System.out::println);
  }
}
