<template>
  <q-carousel
    v-model="slide"
    swipeable
    animated
    :control-type="controlType"
    control-color="deep-purple"
    navigation
    padding
    arrows
    height="300px"
    class="bg-deep-purple-1 text-deep-purple rounded-borders"
  >
    <q-carousel-slide name="style" class="column no-wrap flex-center">
      <q-icon name="style" size="56px" />
      <div class="q-mt-md text-center text-black">
        <p class="text-h6">홈조리원 똑똑</p>
        <p class="text-body2">{{ lorem }}</p>
      </div>
    </q-carousel-slide>

  </q-carousel>
</template>

<script>
import { ref } from 'vue'

export default {
  setup () {
    return {
      controlType: ref('flat'),
      controlTypeOptions: [
        { value: 'regular', label: 'regular' },
        { value: 'unelevated', label: 'unelevated' },
        { value: 'flat', label: 'flat (default)' },
        { value: 'outline', label: 'outline' },
        { value: 'push', label: 'push' }
      ],

      slide: ref('style'),
      lorem: 'Lorem ipsum dolor, sit amet consectetur adipisicing elit. Itaque voluptatem totam, architecto cupiditate officia rerum, error dignissimos praesentium libero ab nemo.'
    }
  }
}
</script>
