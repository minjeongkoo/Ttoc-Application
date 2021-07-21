<template>
  <div class="home-vue-area">
    <div class="hello-section">
      <div>
        <div>
          <div style="height: 36px;"/>
          <p class="head-copy">minjeong님의<br>똑똑 없는 하루가<br>7일이 지났습니다.</p>
          <q-btn outline class="btn-check-me" :ripple="{ color: 'purple-6' }" color="white" text-color="#4F5B62" label="내 몸상태 체크하기 ✍️" no-caps />
          <div style="height: 36px;"/>
          <q-separator />

          <div>
            <div style="height: 36px;"/>
            <p class="ttoc-sub-headline">똑똑 서비스 예약 현황</p>
            <p class="ttoc-headline">민정님 안녕하세요!</p>
            <div style="height: 16px;"/>
            <!-- card list -->
            <lasted-service-ui/>
          </div>

        </div>
      </div>
    </div>

    <q-page padding>

      <div style="height: 36px;"/>
      <p class="ttoc-sub-headline">ttoc ttoc</p>
      <p class="ttoc-headline">서비스 둘러보기 👀</p>
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
  /*text-align: center;*/
}

.hello-section {
  margin-top: 0;
}

.hello-section > div {
  width: 100%;
  background-image: url("assets/img/bg_home_vue.png");
  background-size: cover ;
  background-repeat: no-repeat;
}

.hello-section > div > div {
  margin: 16px;
}

.hello-section .btn-check-me {
  font-size: 18px;
  font-weight: 600;
}

.head-copy {
  font-size: 30px;
  font-weight: 600;
  font-family: 'Nanum Myeongjo', serif;
}

.hello-section .my-card {
  max-width: 380px;
  margin-bottom: 16px;
  border-radius: 20px;
}

</style>
