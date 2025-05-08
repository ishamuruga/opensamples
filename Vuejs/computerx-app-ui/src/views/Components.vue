<script setup>

import { ref } from 'vue'
import CompA from '../components/CompA.vue'
import CompB from '../components/CompB.vue'
import CompC from '../components/CompC.vue'

const currentTab = ref('CompA')

const tabs = {
    CompA,
    CompB,
    CompC
}
</script>

<template>
    <div class="demo">
        <button v-for="(_, tab) in tabs" :key="tab" :class="['tab-button', { active: currentTab === tab }]"
            @click="currentTab = tab">
            {{ tab }}
        </button>
        <KeepAlive>
            <component :is="tabs[currentTab]" class="tab"></component>
        </KeepAlive>
    </div>
</template>

<style>
.demo {
    font-family: sans-serif;
    border: 1px solid #eee;
    border-radius: 2px;
    padding: 20px 30px;
    margin-top: 1em;
    margin-bottom: 40px;
    user-select: none;
    overflow-x: auto;
}

.tab-button {
    padding: 6px 10px;
    border-top-left-radius: 3px;
    border-top-right-radius: 3px;
    border: 1px solid #ccc;
    cursor: pointer;
    background: #f0f0f0;
    margin-bottom: -1px;
    margin-right: -1px;
}

.tab-button:hover {
    background: #e0e0e0;
}

.tab-button.active {
    background: #e0e0e0;
}

.tab {
    border: 1px solid #ccc;
    padding: 10px;
}
</style>