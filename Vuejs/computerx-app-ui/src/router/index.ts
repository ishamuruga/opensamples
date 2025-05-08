import { createRouter, createWebHistory } from "vue-router";
import Home from '../views/Home.vue';
import About from '../views/About.vue';
import Login from "../views/Login.vue";
import Cities from "../views/Cities.vue";
import canAccess from "./utils";
import Register from "../views/Register.vue";
import Components from "../views/Components.vue";

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/', name: 'Login',
            component: Login
        },
        {
            path: '/home', name: 'Home',
            component: Home
        },
        {
            path: '/register', name: 'Register',
            component: Register
        },
        {
            path: '/about/:id', name: 'About',
            component: About
        },
        {
            path: '/cities/:id', name: 'Cities',
            component: Cities,
            props: true
        }, {
            path: '/components', name: 'Components',
            component: Components
        }
        // {
        //     path: '/about',
        //     component: () => import('./pages/About.vue')
        // },
        // {
        //     path: '/contact',
        //     component: () => import('./pages/Contact.vue')
        // }
    ]

})

router.beforeEach((to, from) => {

    let flag: boolean = canAccess(to);

    console.log(flag)

    if (flag) {
        return true;
    } else {
        return { name: 'Login' }

    }

})


// router.beforeResolve(async to => {
//     if (to.meta.requiresCamera) {
//       try {
//         await askForCameraPermission()
//       } catch (error) {
//         if (error instanceof NotAllowedError) {
//           // ... handle the error and then cancel the navigation
//           return false
//         } else {
//           // unexpected error, cancel the navigation and pass the error to the global handler
//           throw error
//         }
//       }
//     }
//   })

export default router;