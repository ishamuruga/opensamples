<script setup lang="ts">

import { DefineProps } from 'vue';

defineProps({
    title: {
        type: String,
        default: 'What do you want to become...',

    },
    subtitle: {
        type: String,
        default: '...',

    }
})

</script>

<template>
    <div>
        <h1>{{ title }}</h1>
        <p>{{ subtitle }}.</p>
        <!-- <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p> -->
    </div>
</template>

<style scoped>
.custom_bg {
    background-color: rgb(209, 239, 209);
    height: 120px;
    text-align: center;
}

.vertical-center {
    margin: 0;
    position: relative;
    top: 50%;
    -ms-transform: translateY(-50%);
    transform: translateY(-50%);
}

p {
    font-weight: bold;
    font-size: 20;
    color: blue
}
</style>