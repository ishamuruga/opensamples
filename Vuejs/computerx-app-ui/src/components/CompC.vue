<script setup lang="ts">

import MessageService from '../services/MessageService';
import CompCa from './CompCa.vue';

const onClick = () => {
    let obj = {
        data: "From Comp C",
        m: Math.random()
    }

    MessageService.getInstance().sendMessage(obj, "ON_COMPC_BTN_CLICKED")
}
</script>
<template>
    <div class="tab">
        C component
        <button @click="onClick">Raise Message</button>
        <div>
            <CompCa></CompCa>
        </div>
    </div>
</template>