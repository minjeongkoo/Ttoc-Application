<template>
  <div>
    <q-tabs
      v-model="tab"
      dense
      outside-arrows
      mobile-arrows
      class="text-deep-purple-12"
    >
      <q-tab class="text-deep-purple-12" name="alarms" icon="mail" label="산전•산후 바디관리" />
      <q-tab class="text-deep-purple-12" name="alarms" icon="alarm" label="산후돌봄" />
      <q-tab class="text-deep-purple-12" name="alarms" icon="movie" label="홈 필라테스" />
      <q-tab class="text-deep-purple-12" name="alarms" icon="mail" label="싱잉볼•명상" />
      <q-tab class="text-deep-purple-12" name="alarms" icon="alarm" label="건강 식사 배송" />
      <q-tab class="text-deep-purple-12" name="alarms" icon="movie" label="홈 클리닉" />
      <q-tab class="text-deep-purple-12" name="alarms" icon="movie" label="딱 맞춤 서비스" />
      <q-tab class="text-deep-purple-12" name="alarms" icon="movie" label="똑똑's Pick" />
    </q-tabs>

    <!-- service by card -->
    <q-card class="my-card">
      <img src="https://cdn.quasar.dev/img/mountains.jpg">

      <q-card-section>
        <div class="text-h6">Our Changing Planet</div>
        <div class="text-subtitle2">by John Doe</div>
      </q-card-section>

      <q-card-section class="q-pt-none">
        {{ lorem }}
      </q-card-section>
    </q-card>

  </div>
</template>
