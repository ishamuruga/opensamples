package com.company.message.consumer.springkafka.consumer;

import java.util.concurrent.CountDownLatch;

import com.company.message.producer.springkafka.payload.CustomerRequest;
import com.company.stream.producer.kafastreamproducer.EliteCustomer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    private CountDownLatch latch = new CountDownLatch(3);

    private CountDownLatch partitionLatch = new CountDownLatch(2);

    private CountDownLatch filterLatch = new CountDownLatch(2);

    private CountDownLatch greetingLatch = new CountDownLatch(1);

    @KafkaListener(topics = "${message.topic.name}", groupId = "foo", containerFactory = "fooKafkaListenerContainerFactory")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group 'foo': " + message);
        latch.countDown();
    }

    @KafkaListener(topics = "${message.topic.name}", groupId = "bar", containerFactory = "barKafkaListenerContainerFactory")
    public void listenGroupBar(String message) {
        System.out.println("Received Message in group 'bar': " + message);
        latch.countDown();
    }

    @KafkaListener(topics = "${message.topic.name}", containerFactory = "headersKafkaListenerContainerFactory")
    public void listenWithHeaders(@Payload String message,
            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("Received Message: " + message + " from partition: " + partition);
        latch.countDown();
    }

    @KafkaListener(topicPartitions = @TopicPartition(topic = "${partitioned.topic.name}", partitions = { "0",
            "3","1","2" }), containerFactory = "partitionsKafkaListenerContainerFactory")
    public void listenToPartition(@Payload String message,
            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("Received Message: " + message + " from partition: " + partition);
        this.partitionLatch.countDown();
    }

    @KafkaListener(topics = "${filtered.topic.name}", containerFactory = "filterKafkaListenerContainerFactory")
    public void listenWithFilter(String message) {
        System.out.println("Received Message in filtered listener: " + message);
        this.filterLatch.countDown();
    }

    @KafkaListener(topics = "${datasync.topic.name}", containerFactory = "customerReqKafkaListenerContainerFactory")
    public void greetingListener(CustomerRequest greeting) {
        System.out.println("##Received Customer Request message: " + greeting);
        this.greetingLatch.countDown();
    } 

    @KafkaListener(topics = "${ecustomer.topic.name}", containerFactory = "eliteCustomerReqKafkaListenerContainerFactory")
    public void greetingListener(EliteCustomer eCustomer) {
        System.out.println("##Received Elite Customer Request message: " + eCustomer);
        this.greetingLatch.countDown();
    } 
}
