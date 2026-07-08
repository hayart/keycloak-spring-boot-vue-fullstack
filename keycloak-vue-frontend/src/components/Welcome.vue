<script setup>

import keycloak from "../auth/keycloak"


const logout = () => {

    keycloak.logout({
        redirectUri: window.location.origin
    })

}


const username =
    keycloak.tokenParsed?.preferred_username


const email =
    keycloak.tokenParsed?.email


</script>


<template>

<div class="container">

<h1>
Welcome {{ username }} 👋
</h1>


<p>
Email: {{ email }}
</p>


<p>
You are authenticated through Keycloak OAuth2 / OpenID Connect
</p>


<button @click="logout">
Logout
</button>


</div>

</template>


<style scoped>

.container {

    margin:50px;
    font-family:Arial;

}

button {

    padding:10px 20px;
    cursor:pointer;

}

</style>