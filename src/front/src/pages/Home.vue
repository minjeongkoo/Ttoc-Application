<template>
  <div class="home-vue-area">
    <!-- wellcome -->
    <div class="section">
      {{ wellcome() }}
      <div class="ttoc-title hello-title">
          <span>
            <div class="ttoc-border"/>
            <span>반갑습니다. {{ userInfo.name }}님!</span>
          </span>
      </div>
      <div class="recommend">
        <q-spinner-box color="teal-13" size="24px"/>
        <span v-if="wellcomeMassage.nicetomeetyou"> 주기적으로 내 몸상태를 체크해보세요.</span>
        <span v-if="wellcomeMassage.longtimenosee"> 똑똑 없는 하루가 {{ userInfo.lasted_serviced }}일이 지났습니다.</span>
      </div>
      <q-btn push class="bg-deep-purple-12 text-white">내 몸상태 체크해보기</q-btn>
    </div>

    <!-- lasted service card list -->
    <div class="section">
      <div style="display: flex; justify-content: space-between;">
        <span class="text-h6">MY RESERVATIONS</span>
        <q-toggle v-model="visible_my_service.show" color="primary" keep-color label="내역 표시"/>
      </div>

      <div>
        <div v-show="visible_my_service.show" class="lasted-service-slide">
          <q-card v-for="service in LastedServiceStatus.services" class="my-card bg-primary text-white">
            <q-card-section>
              <!-- Sercive Name -->
              <div class="text-h6">{{ service.service_name }}</div>
              <!-- Sercive Detail -->
              <q-icon name="emoji_objects" size="20px"/>
              <span class="text-body2">{{ service.service_detail.number_of_service }}회 서비스 </span>
              <q-icon name="watch_later" size="20px"/>
              <span class="text-body2">{{ service.service_detail.service_content }}</span>
              <!-- Created AT -->
              <div class="created-at">{{ service.createdAt }} 신청서 접수</div>
            </q-card-section>
            <q-card-actions>
              <q-btn flat>결제내역</q-btn>
              <q-btn flat>문의하기</q-btn>
            </q-card-actions>
          </q-card>
        </div>
      </div>
    </div>

    <q-separator/>

    <div class="section">
      <p class="text-h6">홈조리원 둘러보기!</p>
      <service-about-slide/>
    </div>

    <q-separator/>


  </div>
</template>

<script>
// Componants
import ServiceAboutSlide from "components/home/ServiceAboutSlide";

export default {
  components:{
    'service-about-slide': ServiceAboutSlide
  },
  data() {
    return {
      userInfo: {
        name: 'minjeong',
        lasted_serviced: 8
      },
      LastedServiceStatus: {
        services: {
          service_1: {
            service_name: '산전, 산후 바디관리',
            service_detail: {
              number_of_service: 3,
              service_content: '전신관리 풀 90분'
            },
            service_status: '진행중',
            createdAt: 'YYYY-MM-DD 00:00',
            serive_number: 'B00001',
          },
          service_2: {
            service_name: '싱잉볼, 명상 서비스',
            service_detail: {
              number_of_service: 1,
              service_content: '명상 시간 50분'
            },
            service_status: '1차 상담 대기중',
            createdAt: 'YYYY-MM-DD 00:00',
            serive_number: 'S00001',
          },
          service_3: {
            service_name: '홈 필라테스 (임산부)',
            service_detail: {
              number_of_service: 12,
              service_content: '수업시간 50분'
            },
            service_status: '2차 상담 대기중',
            createdAt: 'YYYY-MM-DD 00:00',
            serive_number: 'PP00001',
          }
        }
      },
      wellcomeMassage: {
        nicetomeetyou: true,
        longtimenosee: false
      },
      visible_my_service: {
        show: true
      }
    }
  },
  methods: {
    wellcome() {
      const lastedServicedDays = this.userInfo.lasted_serviced;
      if (lastedServicedDays > 7 && lastedServicedDays < 20) {
        this.wellcomeMassage.nicetomeetyou = false;
        this.wellcomeMassage.longtimenosee = true;
      } else {
        this.wellcomeMassage.nicetomeetyou = true;
        this.wellcomeMassage.longtimenosee = false;
      }
    }
  }
}

</script>

<style scoped>
.home-vue-area .section {
  padding: 20px;
}

.hello-title {
  font-size: 30px;
  font-weight: 600;
}

.recommend {
  font-size: 1.2rem;
  margin-top: 16px;
  margin-bottom: 32px;
}

.lasted-service-slide {
  margin-top: 16px;
}

.lasted-service-slide .my-card {
  margin-bottom: 16px;
}

.lasted-service-slide .created-at {
  opacity: 0.7;
  margin-top: 12px;
}

</style>
