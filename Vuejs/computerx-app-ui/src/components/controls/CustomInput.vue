<template>
    <div class="wrapper">
        <label v-if="label" :for="name">{{ label }}</label>
        <input :id="name" :class="{ field_error: errorMessage, valid: meta.valid }" class="input" v-model="value"
            :placeholder="placeholder" :type="type || 'text'" />

        <small :class="errorMessage ? 'error_message' : ''">{{ errorMessage }}</small>
    </div>
</template>

<script setup>
import { useField } from 'vee-validate'

const props = defineProps({
    name: {
        type: String,
        required: true
    },
    type: String,
    placeholder: String,
    label: String
})

const { value, errorMessage, meta } = useField(() => props.name)
</script>
<style scoped>
.wrapper {
    display: flex;
    flex-direction: column;
    margin-bottom: 10px;
    gap: 3px;
}

.error_message {
    color: red;
}

.field_error {
    border: 1px solid red !important;
}

.input {
    width: 100%;
    height: 30px;
    border-radius: 5px;
    padding: 10px;
    border: 0.5px solid gray;
}

.input:focus {
    outline: none;
}

.valid {
    border: 1px solid green !important;
}

label {
    font-size: 14px;
    font-weight: 600;
}
</style>