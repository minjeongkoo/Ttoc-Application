<template>
  <div class="q-pa-md q-gutter-y-sm">
    <q-toolbar>
      <q-btn flat round dense icon="menu" v-on:click="opneQuickMenu()"/>
      <q-toolbar-title>
        홈조리원 똑똑
      </q-toolbar-title>
        <q-btn outline style="color: #834BF9;" label="예약하기" />
    </q-toolbar>
  </div>
  <quick-menu v-show="quickMenuEvent.open"/>
</template>

<script>
import QuickMenu from '../components/QuickMenu'

export default {
  data: function() {
    return {
      quickMenuEvent: {
        open: false
      }
    }
  },
  components: {
    'quick-menu': QuickMenu
  },
  methods: {
    opneQuickMenu(openEvent) {
      if (this.quickMenuEvent.open === false) {
        this.quickMenuEvent.open = true;
      }else {
        this.quickMenuEvent.open = false;
      }
    }
  }

}

</script>
