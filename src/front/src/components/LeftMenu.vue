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

        <div class="left-ttoc-service-list">

          <q-item clickable v-ripple>
            <q-item-section avatar>
              <q-icon color="blue-grey-10" name="playlist_add_check_circle" />
            </q-item-section>

            <q-item-section>딱 맞춤 서비스</q-item-section>
          </q-item>

          <q-item clickable v-ripple>
            <q-item-section avatar>
              <q-icon color="blue-grey-10" name="pregnant_woman" />
            </q-item-section>

            <q-item-section>산전 • 산후 바디관리</q-item-section>
          </q-item>

          <q-item clickable v-ripple>
            <q-item-section avatar>
              <q-icon color="blue-grey-10" name="foundation" />
            </q-item-section>

            <q-item-section>홈 필라테스</q-item-section>
          </q-item>

          <q-item clickable v-ripple>
            <q-item-section avatar>
              <q-icon color="blue-grey-10" name="nights_stay" />
            </q-item-section>

            <q-item-section>싱잉볼 • 명상</q-item-section>
          </q-item>

          <q-item clickable v-ripple>
            <q-item-section avatar>
              <q-icon color="blue-grey-10" name="local_dining" />
            </q-item-section>

            <q-item-section>건강식 배송</q-item-section>
          </q-item>

          <q-item clickable v-ripple>
            <q-item-section avatar>
              <q-icon color="blue-grey-10" name="living" />
            </q-item-section>

            <q-item-section>홈 클리닉</q-item-section>
          </q-item>

        </div>

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

