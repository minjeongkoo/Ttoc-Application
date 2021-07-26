<template>
    <q-layout view="hHh lpR fFf" class="ttoc-body">

      <!-- header -->
      <q-header bordered class="bg-white text-black">
        <q-toolbar class="ttoc-header-toolbar">
          <div style="width: 33%; text-align: left;">
            <q-btn dense flat round icon="menu" @click="toggleLeftDrawer" />
          </div>
          <div style="width: 33%; text-align: center;">
            <img src="./assets/img/app-header-logo.svg" style="height: 26px; margin-top: 5px;">
          </div>
          <div style="width: 33%; text-align: right">
            <q-btn flat dense class="bg-blue-grey-1 text-blue-grey-8 btn-reservation" size="16px" label="예약하기"/>
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

<style scoped>
.btn-reservation {
  padding: 5px 10px 5px 10px;
}
</style>

<!--Common CSS-->
<style src="../src/style/ttoc-style.css" type="text/css"/>
