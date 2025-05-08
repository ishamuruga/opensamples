<template>
    <header>
        <slot name="header" />
    </header>
    <main>
        <slot />
    </main> <!-- default slot -->
    <footer>
        <slot name="footer" />
    </footer>
</template>