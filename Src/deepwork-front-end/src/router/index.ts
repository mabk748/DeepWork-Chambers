import { createRouter, createWebHashHistory, RouteRecordRaw } from 'vue-router'
import GaleryView from '../views/GaleryView.vue'
import HomeView from '../views/HomeView.vue'
import LoginPage from '../views/LoginView.vue';
const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/login',
    name:'login',
    component: LoginPage
  },
  {
    path: '/galery',
    name:'galery',
    component: GaleryView
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
