<template>
  <app-header/>
  <router-view />
</template>

<script>
import Header from "./components/Header";

export default {
  components: {
    'app-header': Header
  }
}
</script>

<!--Common CSS-->
<style src="../src/style/ttoc-style.css" type="text/css"/>
