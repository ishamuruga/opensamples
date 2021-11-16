package com.company.message.consumer.springkafka.config;

import java.util.HashMap;
import java.util.Map;

import com.company.message.producer.springkafka.payload.CustomerRequest;
import com.company.stream.producer.kafastreamproducer.EliteCustomer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {
    @Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;

    public ConsumerFactory<String, String> consumerFactory(String groupId) {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(props);
    }

    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory(String groupId) {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory(groupId));
        return factory;
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> fooKafkaListenerContainerFactory() {
        return kafkaListenerContainerFactory("foo");
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> barKafkaListenerContainerFactory() {
        return kafkaListenerContainerFactory("bar");
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> headersKafkaListenerContainerFactory() {
        return kafkaListenerContainerFactory("headers");
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> partitionsKafkaListenerContainerFactory() {
        return kafkaListenerContainerFactory("partitions");
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> filterKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = kafkaListenerContainerFactory("filter");
        factory.setRecordFilterStrategy(record -> record.value().contains("World"));
        return factory;
    }

    public ConsumerFactory<String, CustomerRequest> customerRequestConsumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "customerreq");

        JsonDeserializer<CustomerRequest> customerReqJsonDeserializer = new JsonDeserializer<>(CustomerRequest.class);
        customerReqJsonDeserializer.addTrustedPackages("*");

        return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(),customerReqJsonDeserializer);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, CustomerRequest> customerReqKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, CustomerRequest> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(customerRequestConsumerFactory());
        return factory;
    }

    public ConsumerFactory<String, EliteCustomer> eliteCustomerRequestConsumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "customerreq");

        JsonDeserializer<EliteCustomer> customerReqJsonDeserializer = new JsonDeserializer<>(EliteCustomer.class);
        customerReqJsonDeserializer.addTrustedPackages("*");

        return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(),customerReqJsonDeserializer);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, EliteCustomer> eliteCustomerReqKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, EliteCustomer> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(eliteCustomerRequestConsumerFactory());
        return factory;
    }

   
}
