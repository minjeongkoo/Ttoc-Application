<template>
    <q-layout view="hHh lpR fFf">

      <!-- header -->
      <q-header elevated class="bg-primary text-white">
        <q-toolbar class="ttoc-header-toolbar">
          <q-btn dense flat round icon="menu" @click="toggleLeftDrawer" />
          <div>
            <img src="./assets/img/app-header-logo.svg" style="height: 30px; margin-top: 4px;">
          </div>
          <div>
            <q-btn dense flat round icon="book_online"/>
          </div>
        </q-toolbar>
      </q-header>

      <q-drawer show-if-above v-model="leftDrawerOpen" side="left" bordered>
        <!-- drawer content -->
        <left-menu/>
      </q-drawer>

      <q-page-container class="ttoc-router-view">
        <router-view />
      </q-page-container>

    </q-layout>
</template>

<script>
import LeftMenu from "components/LeftMenu";
import { ref } from 'vue';

export default {
  setup () {
    const leftDrawerOpen = ref(false)

    return {
      leftDrawerOpen,
      toggleLeftDrawer () {
        leftDrawerOpen.value = !leftDrawerOpen.value
      }
    }
  },
  components: {
    'left-menu': LeftMenu
  }
}
</script>

<!--Common CSS-->
<style src="../src/style/ttoc-style.css" type="text/css"/>
