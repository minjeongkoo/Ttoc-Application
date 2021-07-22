<template>
  <div class="home-vue-area">

    <div class="hello-section bg-deep-purple-1">
      <div>
        <div>

          <!-- Hello User -->
          <div style="height: 36px;"/>
          <p class="head-copy">똑똑 없는 하루가<br>7일이 지났습니다.</p>
          <p class="text-body2">MY POINT <b>20,000원</b></p>
          <q-btn push color="primary" label="내 몸상태 체크해보기" v-on:click="$router.push({ path: 'dd' })"/>
          <div style="height: 36px;"/>
          <q-separator />

        </div>
      </div>
    </div>

    <q-page padding>

      <!-- My Lasted Reservation -->
      <div>
        <div style="height: 36px;"/>
        <p class="ttoc-sub-headline">MY RESERVATION</p>
        <p class="ttoc-headline">minjeong님 안녕하세요!</p>
        <div style="height: 16px;"/>
        <!-- Card List -->
        <lasted-service-ui  style="text-align: left"/>
      </div>

      <p class="ttoc-sub-headline">똑똑</p>
      <p class="ttoc-headline">홈조리원 둘러보기</p>
      <div style="height: 16px;"/>

      <service-slide-ui/>

    </q-page>

  </div>
</template>

<script>
import axios from 'axios';
import ServiceSlideUI from '../components/home/ServiceSlideUI';
import LastedServiceCardUI from '../components/home/LastedServiceCardUI';

export default {
  components: {
    'service-slide-ui': ServiceSlideUI,
    'lasted-service-ui': LastedServiceCardUI
  },
  data: function(){
    return {
      testDatas: Object
    }
  },
  mounted: function (){
    axios.get('/api/pxytst')
      .then(response => {
        console.log(response);
        this.testDatas = response;
      })
      .catch(function (error) {
        console.log(error);
      });
  }
}

</script>

<style>
.home-vue-area {
  text-align: center;
}

.home-vue-area .q-layout-padding {
  padding: 16px;
}

.hello-section {
  margin-top: 0;
  text-align: left;
}

.hello-section > div {
  width: 100%;
  /*background-image: url("assets/img/bg_home_vue.png");*/
  /*background-size: cover ;*/
  /*background-repeat: no-repeat;*/
}

.hello-section > div > div {
  margin: 16px;
}

.hello-section .head-copy {
  text-align: left;
  font-size: 1.5rem;
  font-weight: 600;
  font-family: 'Nanum Myeongjo', serif;
  margin-bottom: 100px;
}

.hello-section .my-card {
  max-width: 380px;
  margin-bottom: 16px;
  border-radius: 20px;
}

</style>
