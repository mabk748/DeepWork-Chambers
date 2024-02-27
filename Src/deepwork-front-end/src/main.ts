import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import { createPinia } from 'pinia'

const app = createApp(App)

// Créer une instance Pinia
const pinia = createPinia()

// Installer Pinia dans l'application Vue
app.use(pinia)

// Utiliser le routeur et monter l'application
app.use(router).mount('#app')
