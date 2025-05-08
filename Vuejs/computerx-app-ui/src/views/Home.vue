<script setup lang="ts">

import { onErrorCaptured, ref } from 'vue';
import { useRouter } from 'vue-router';
import HelloWorld from '../components/HelloWorld.vue';
import GreetMessage from '../components/GreetMessage.vue';
import ChildComponentsError from '../components/ChildComponentsError.vue';

const router = useRouter();

const onClick = () => {
    let d = {
        name: "About",
        params: {
            id: Math.random()
        }
    }

    let d1 = {
        name: "Cities",
        params: {
            id: Math.random()
        }
    }

    let d2 = {
        name: "Cities",
        params: {
            id: Math.random()
        },
        state: {
            userData: { id: 1, name: 'Alice' }
        }
    }
    router.push(d2)
    //router.push("/about");
}

function handleGreeting(message: string) {
    console.log(message)  // Logs: "Hello from child!"
}

onErrorCaptured((err, instance, info) => {
    console.error('Error captured:', err)
    console.warn('Error origin:', info)
    return false  // return true to stop further propagation
})

</script>
<template>
    <div class="home">
        <h2>Home</h2>
        <button @click="onClick">About</button>
        <GreetMessage title="Hi Virtusa" :count="100" @sayHello="handleGreeting"></GreetMessage>
        <ChildComponentsError></ChildComponentsError>
    </div>
</template>