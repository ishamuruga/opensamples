<template>
    <div>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <router-link class="nav-link" to="/">Login</router-link>
                        </li>
                        <li class="nav-item">
                            <router-link class="nav-link" to="/register">Register</router-link>
                        </li>
                        <li class="nav-item">
                            <router-link class="nav-link" to="/home">Home</router-link>
                        </li>
                        <li class="nav-item">
                            <router-link class="nav-link" to="/about/1">About</router-link>
                        </li>
                        <li class="nav-item">
                            <router-link class="nav-link" to="/cities/1">Cities</router-link>
                        </li>
                        <li class="nav-item">
                            <router-link class="nav-link" to="/components">Components</router-link>
                        </li>

                    </ul>
                </div>
            </div>
        </nav>
    </div>
</template>