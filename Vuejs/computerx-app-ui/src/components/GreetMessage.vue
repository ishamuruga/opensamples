<script setup lang="ts">

const emit = defineEmits(['sayHello'])

const props = defineProps({
    title: {
        type: String,
        required: true
    },
    count: {
        type: Number,
        default: 0
    }
})

function handleClick() {
    console.log('Button clicked!');
    emit('sayHello', 'Hello from child!');
}

</script>
<template>
    <div class="card" style="width: 18rem;">
        <img src="https://upload.wikimedia.org/wikipedia/commons/d/da/Panthera_tigris_tigris_Tidoba_20150306.jpg"
            class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">{{ title }}</h5>
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's
                content {{ count }}.</p>
            <!-- <a href="#" class="btn btn-primary">Go somewhere</a> -->
            <button @click="handleClick" class="btn btn-primary">Go somewhere</button>
        </div>
    </div>
</template>