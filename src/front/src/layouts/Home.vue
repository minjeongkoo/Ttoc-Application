<template>
<div>
  home vue

</div>
</template>

<script>
import axios from 'axios';

export default {
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
