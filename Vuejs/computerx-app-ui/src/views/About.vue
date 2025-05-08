<script setup lang="ts">
import { useRoute } from 'vue-router';
import ChildComponents from '../components/ChildComponents.vue';
import ChildComponents2 from '../components/ChildComponents2.vue';

const route = useRoute();
console.log(route.params.id)
</script>
<template>
    <div class="home">
        <h2>About</h2>
        <ChildComponents>
            <p>This is inserted into the child!</p>
            <h2>Another Title from Parent Components</h2>
        </ChildComponents>
        <hr />
        <ChildComponents2>
            <template #header>
                <h1>Custom Header</h1>
            </template>

            <p>This goes into the default slot.</p>

            <template #footer>
                <small>Custom Footer</small>
            </template>
        </ChildComponents2>
    </div>
</template>