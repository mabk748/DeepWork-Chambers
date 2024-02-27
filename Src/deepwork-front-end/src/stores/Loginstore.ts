import { defineStore } from 'pinia';
export const useStore = defineStore({
    id: 'loginstore',
    state: () => ({
        ShowLoginModal:false
    }),
    actions: {
        toggleShowLoginModal (){
            this.ShowLoginModal = !this.ShowLoginModal;
        }
    },
})