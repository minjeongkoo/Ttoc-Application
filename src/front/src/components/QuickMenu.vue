<template>
  <div class="q-pa-md quick-menu" style="max-width: 350px">

    <!-- close Quick Menu -->
    <q-icon class="close-quick-menu" color="black" name="chevron_left" v-on:click="closeMenu()"/>

    <q-list bordered>

      <!-- hello & info -->

      <div class="user-card">
        <q-card flat bordered class="my-card">
          <q-card-section>
            <div class="text-h6">반갑습니다. 민정님!</div>
          </q-card-section>

          <q-card-section class="q-pt-none">
            내 적립금 • 쿠폰 합계 <b>20,000원</b>
          </q-card-section>


          <q-card-section class="q-pt-none">
            <q-btn-group outline>
              <q-btn outline color="blue-grey-9" label="프로필" icon="account_circle"/>
              <q-btn outline color="blue-grey-9" label="장바구니" icon="favorite"/>
            </q-btn-group>
          </q-card-section>

        </q-card>
      </div>

      <!-- ttoc service list -->
      <div class="menu-list-item">
        <div class="ttoc-title">
        <span>
          <div class="ttoc-border"/>
          <span>홈조리원 똑똑 서비스</span>
        </span>
        </div>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-avatar>
              <img src="../assets/img/quick-menu-list/007-neural.svg">
            </q-avatar>
          </q-item-section>
          <q-item-section>딱 맞춤 서비스</q-item-section>
        </q-item>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-avatar>
              <img src="../assets/img/quick-menu-list/004-working-mother.svg">
            </q-avatar>
          </q-item-section>
          <q-item-section>산후 돌봄</q-item-section>
        </q-item>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-avatar>
              <img src="../assets/img/quick-menu-list/001-body.svg">
            </q-avatar>
          </q-item-section>
          <q-item-section>산전 • 산후 바디관리</q-item-section>
        </q-item>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-avatar>
              <img src="../assets/img/quick-menu-list/005-pilates-ball.svg">
            </q-avatar>
          </q-item-section>
          <q-item-section>홈 필라테스</q-item-section>
        </q-item>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-avatar>
              <img src="../assets/img/quick-menu-list/003-night-mode.svg">
            </q-avatar>
          </q-item-section>
          <q-item-section>싱잉볼 • 명상</q-item-section>
        </q-item>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-avatar>
              <img src="../assets/img/quick-menu-list/002-healthy-food.svg">
            </q-avatar>
          </q-item-section>
          <q-item-section>건강식 배송</q-item-section>
        </q-item>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-avatar>
              <img src="../assets/img/quick-menu-list/006-house.svg">
            </q-avatar>
          </q-item-section>
          <q-item-section>홈 클리닉</q-item-section>
        </q-item>

        <!-- ttoc shop -->

        <div class="ttoc-title">
        <span>
          <div class="ttoc-border"/>
          <span>SHOP & EVENT</span>
        </span>
        </div>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-icon color="blue-grey-10" name="verified" />
          </q-item-section>

          <q-item-section>똑똑's Pick</q-item-section>
        </q-item>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-icon color="blue-grey-10" name="confirmation_number" />
          </q-item-section>

          <q-item-section>똑똑 이벤트</q-item-section>
        </q-item>

        <!-- ttoc shop -->

        <div class="ttoc-title">
        <span>
          <div class="ttoc-border"/>
          <span>공지 & 설정</span>
        </span>
        </div>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-icon color="blue-grey-10" name="notifications" />
          </q-item-section>

          <q-item-section>공지사항</q-item-section>
        </q-item>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-icon color="blue-grey-10" name="headset_mic" />
          </q-item-section>

          <q-item-section>상담 & 문의하기</q-item-section>
        </q-item>
      </div>


    </q-list>
  </div>
</template>

<script>
export default {
  props: ['quick-menu-open'],
  methods: {
    closeMenu: function () {
      this.$emit('close');
    }
  }
}

</script>

<style>
.quick-menu {
  z-index: 200;
  position: absolute;
  top: 0;
  width: 100%;
  height: 100%;
  max-width: none !important;
  padding: 0;
  background: #0000003d;
  padding: 0 40px 0 0;
}

.quick-menu .q-list--bordered {
  height: 100%;
  background: white;
  overflow: scroll;
}

.quick-menu::-webkit-scrollbar {
  display: none;
}

.close-quick-menu {
  z-index: 200;
  position: absolute;
  top: 50%;
  right: 42px;
  font-size: 40px;
  opacity: 0.5;
}

.menu-list-item {}

</style>
