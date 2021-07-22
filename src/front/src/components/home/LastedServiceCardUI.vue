<template>
  <div>
        <!-- 1 -->
        <q-card class="my-card">
          <q-card-section horizontal>
            <q-card-section class="q-pt-xs" style="padding: 16px;">
              <q-chip color="teal-3" text-color="white" label="1차 상담 대기중"/>
              <div class="ttoc-title">
                <span>
                  <div class="ttoc-border"/>
                  <span>산전 • 산후 바디관리 예약</span>
                </span>
              </div>
              <span class="text-body1"> <q-icon name="schedule"/>       90분 전신관리&nbsp;|	&nbsp;</span>
              <span class="text-body1"> <q-icon name="card_giftcard"/>  총 12회 서비스</span>
            </q-card-section>
          </q-card-section>
          <q-separator />
          <q-card-actions>
            <q-btn flat>문의하기</q-btn>
            <q-btn flat>결제정보</q-btn>
          </q-card-actions>
        </q-card>

        <!-- 2 -->
        <q-card class="my-card">
          <q-card-section horizontal>
            <q-card-section class="q-pt-xs" style="padding: 16px;">
              <q-chip color="teal-3" text-color="white" label="진행중"/>
              <q-chip color="teal-3" text-color="white" label="2021-07-06 17:00 접수함"/>
              <div class="ttoc-title">
                <span>
                  <div class="ttoc-border"/>
                  <span>홈 필라테스 (임산부 전용) 예약</span>
                </span>
              </div>
              <span class="text-body1"> <q-icon name="schedule"/>       50분 수업&nbsp;|	&nbsp;</span>
              <span class="text-body1"> <q-icon name="check"/>          12/4 진행중</span>
            </q-card-section>
          </q-card-section>
          <q-separator />
          <q-card-actions>
            <q-btn flat>문의하기</q-btn>
            <q-btn flat>결제정보</q-btn>
            <q-btn flat>코치님 연락처</q-btn>
          </q-card-actions>
        </q-card>

    <div style="height: 36px;"/>
  </div>
</template>

<style scoped>
.my-card {
  margin-bottom: 16px;
  border-radius: 20px;
}

.ttoc-title {
  font-size: 20px;
}
</style>
