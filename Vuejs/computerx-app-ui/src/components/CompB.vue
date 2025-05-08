<script setup lang="ts">

const name = ref("")

import { onActivated, onDeactivated, ref } from 'vue'

onActivated(() => {
    console.log('MyComponent is activated')
})

onDeactivated(() => {
    console.log('MyComponent is deactivated')
})

</script>
<template>
    <div class="tab">
        <p>B component</p>
        <div>
            <input type="text" v-model="name">
            <p>{{ name }}</p>
        </div>
    </div>
</template>