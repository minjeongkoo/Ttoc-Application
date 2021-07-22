<template>
  <div>
    <div class="q-pa-md" style="max-width: 350px;">
      <q-list style="margin: 16px;">

        <div class="ttoc-title">
          <span>
            <div class="ttoc-border"/>
            <span>My Page ></span>
          </span>
        </div>

        <q-separator />

        <!-- 홈조리원 서비스 바로가기 -->

        <div class="ttoc-title">
          <span>
            <div class="ttoc-border"/>
            <span>홈조리원 똑똑 서비스</span>
          </span>
        </div>

        <service-icon-list/>

        <q-separator />

        <!-- 샵, 이벤트 바로가기 -->

        <div class="ttoc-title">
          <span>
            <div class="ttoc-border"/>
            <span>SHOP & EVENT</span>
          </span>
        </div>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-icon color="blue-grey-10" name="shopping_basket" />
          </q-item-section>

          <q-item-section>똑똑's Pick</q-item-section>
        </q-item>

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-icon color="blue-grey-10" name="local_activity" />
          </q-item-section>

          <q-item-section>똑똑 이벤트 💝</q-item-section>
        </q-item>

        <q-separator />

        <!-- 공지, 설정 바로가기 -->
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

        <q-item clickable v-ripple>
          <q-item-section avatar>
            <q-icon color="blue-grey-10" name="manage_accounts" />
          </q-item-section>

          <q-item-section>프로필 수정 / 로그아웃</q-item-section>
        </q-item>

        <q-separator />


      </q-list>
    </div>
  </div>

</template>

<script>
import ServiceIconList from '../components/ServiceIconList'


export default {
  components: {
    'service-icon-list': ServiceIconList
  }
}

</script>

<style>

.left-ttoc-service-list {
  font-weight: 600;
}

</style>

<style lang="sass">
.my-content
  display: flex
  justify-content: center
  padding: 4px 2px
  text-align: center
  font-size: 12px
  min-height: 64px

.my-content>div
  align-self: center

.my-content>div>div
  display: flex
  justify-content: center
  margin-bottom: 4px

.my-content>div>div>img
  width: 32px
</style>

