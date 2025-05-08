<script setup lang="ts">
defineProps({
    id: String
})

import { onBeforeUpdate, onMounted, onUnmounted, onErrorCaptured, onBeforeMount, onBeforeUnmount, onUpdated } from 'vue';
import { useRouter } from 'vue-router';
import OrderService from '../services/OrderService';
import { ref } from 'vue'
import ChildComponentsError from '../components/ChildComponentsError.vue'

let counter: any = ref(0);

const router = useRouter();
let before: number = 0;
let orders: any = ref([]);

const incrementCounter = () => {
    counter.value++
}


// Before the component is mounted
// onBeforeMount → onMounted → onBeforeUpdate → onUpdated → onBeforeUnmount → onUnmounted
// Initialize reactive state that's not dependent on the DOM but must be ready before mount.
// Log that a component is about to appear.
// Trigger loading state before component appears:
// onBeforeMount(() => {
//   isLoading.value = true
// })
// One-time setup before the component is painted (but after reactivity is ready).
// onBeforeMount(() => {
//   form.value = {
//     name: '',
//     email: '',
//   }
// })

onBeforeMount(() => {
    before = Math.round(Math.random() * 1000)
    new OrderService().getUsersAdv().subscribe((res: any) => {
        res.json().then((r: any) => {
            orders.value = r
        })
    })
})


// onMounted() runs after the component is mounted into the DOM, meaning:
// All the HTML is rendered
// You can now safely access or manipulate the DOM
// Useful for triggering API calls when the component appears:
// For example, initializing a chart or slider after the DOM is ready:
// onMounted(() => {
//   new Swiper('.my-slider', { loop: true })
// })
// Set intervals or observers that require real elements:
// onMounted(() => {
//   observer.observe(document.querySelector('#target'))
// })
onMounted(() => {

})

// Handle updates before the DOM is patched
//Registers a hook to be called right before the component is about to update its DOM tree due to a reactive state change.
onBeforeUpdate(() => {
    console.log("Before Update Hook Triggered..." + counter.value);
    counter.value = counter.value + 2;
})

onUpdated(() => {
    console.log("Asfter Update Hook Triggered..." + counter.value);
})

// Registers a hook to be called right before a component instance is to be unmounted.
onBeforeUnmount(() => {
    console.log("Before Un Mounted")
})

// onUnmounted() runs after the component is removed from the DOM.
onUnmounted(() => {
    console.log("Aftre Un Mounted")
})

onErrorCaptured((err, vm, info) => {
    console.error("======================Start")
    //console.log(vm)
    // console.error(err);
    // console.error(info);

    // console.error(`Error captured in component: ${info}`);
    // console.error(`Error captured in component: ${vm}`);
    console.error("======================End")
    return true;
});

onErrorCaptured((err, instance, info) => {
    console.error('Error captured:', err)
    console.warn('Error origin:', info)
    return false  // return true to stop further propagation
})

</script>
<template>
    <div class="home">
        <h2>Cities - {{ id }}</h2>
        <h3>{{ before }}</h3>
        <h3>{{ counter }}<button @click="incrementCounter">Increment</button></h3>
        <h2>Citis2 - {{ router.options.history.state.userData }} </h2>
        <div>Data - {{ orders.length }}</div>
        <div v-for="order in orders">
            {{ order.id }} - {{ order.orderName }} - {{ order.ts }}
        </div>
        <div>
            <!-- <ChildComponentsError></ChildComponentsError> -->
        </div>
    </div>
</template>