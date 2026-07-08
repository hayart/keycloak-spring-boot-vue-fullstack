import { createRouter, createWebHistory } from 'vue-router'

import Welcome from '../components/Welcome.vue'


const router = createRouter({

    history:createWebHistory(),

    routes:[
        {
            path:'/',
            component:Welcome
        }
    ]

})


export default router