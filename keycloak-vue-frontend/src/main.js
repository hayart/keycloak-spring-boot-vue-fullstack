import { createApp } from 'vue'
import './style.css'
import App from './App.vue'

import router from './router'
import keycloak from './auth/keycloak'

keycloak.init({
    onLoad: 'login-required',
    checkLoginIframe: false
})
    .then(authenticated => {

        if (!authenticated) {
            window.location.reload()
        }

        createApp(App)
            .use(router)
            .mount('#app')

    })
    .catch(error => {
        console.error("Keycloak initialization failed", error)
    })

createApp(App).mount('#app')




