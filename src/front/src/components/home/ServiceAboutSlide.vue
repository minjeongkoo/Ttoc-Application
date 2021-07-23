<template>
  <q-carousel
    v-model="slide"
    transition-prev="scale"
    transition-next="scale"
    swipeable
    animated
    control-color="white"
    padding
    arrows
    height="320px"
    class="bg-deep-purple-1 rounded-borders service-about-slide"
  >

    <q-carousel-slide name="checking_my_condition" class="column no-wrap flex-center">
      <div>
        <img src="../../assets/img/home-service-slide/background_condition.png"/>
        <div>
          <p class="title">딱 맞춤 서비스</p>
          <p>Content</p>
        </div>
        <div style="text-align: center; margin-top: 20px;">
          <q-btn flat class="bg-primary text-white" label="둘러보기"/>
        </div>
      </div>
    </q-carousel-slide>

  </q-carousel>
</template>

<script>
import {ref} from 'vue';

export default {
  setup() {
    return {
      slide: ref('checking_my_condition')
    }
  }
}
</script>

<style>
.service-about-slide {
  text-align: center;
  border-radius: 20px;
}

.service-about-slide img {
  width: 64px;
  height: 64px;
  margin-bottom: 16px;
}

.service-about-slide .title {
  font-size: 20px;
  font-weight: 600;
}

.service-about-slide .q-carousel__slide {
  padding-left: 20px !important;
  padding-right: 20px !important;
}

.service-about-slide .q-carousel__slide > div {
  width: 100%;
}
</style>
