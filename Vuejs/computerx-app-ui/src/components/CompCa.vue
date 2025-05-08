<script setup lang="ts">

import { onBeforeMount, onMounted, ref } from 'vue';
import MessageService from '../services/MessageService';

let pl: any = ref([])

onMounted(() => {
    MessageService.getInstance().listener().subscribe((x: any) => {
        pl.value.push(x)
    })
})
</script>

<template>
    <div class="tab">
        C[a] component
        <p v-for="m in pl">{{ m.ts }}</p>
    </div>
</template>