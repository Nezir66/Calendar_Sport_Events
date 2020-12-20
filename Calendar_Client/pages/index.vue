<template>
  <div class="container-fluid">
    <div class="row">
      <div class="col-xl-2 col-lg-2 col-md-2 col-sm-2 col-xs-2"></div>
      <div class="col-xl-8 col-lg-8 col-md-8 col-sm-8 col-xs-8">
        <div class="calender">
          <div class="row headerCalender">
            <h1><</h1>
            <h1>November 2020</h1>
            <h1>></h1>
          </div>
          <div class="row bodyDays">
            <h4 class="days">Sun</h4>
            <h4 class="days">Mon</h4>
            <h4 class="days">Tue</h4>
            <h4 class="days">Wed</h4>
            <h4 class="days">Thu</h4>
            <h4 class="days">Fri</h4>
            <h4 class="days">Sat</h4>
          </div>
          <div class="row columns">
            <first-row>
              <template  v-slot:1>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 1">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template v-slot:2>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 2">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                </div>
              </template>
            </first-row>
            <second-row>
              <template  v-slot:3>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 3">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:4>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 4">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:5>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 5">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:6>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 6">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:7>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 7">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:8>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 8">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:9>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 9">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
            </second-row>
            <third-row>
              <template  v-slot:10>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 10">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:11>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 11">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:12>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 12">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:13>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 13">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:14>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 14">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:15>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 15">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:16>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 16">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
            </third-row>
            <fourth-row>
              <template  v-slot:17>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 17">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:18>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 18">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:19>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 19">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:20>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 20">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:21>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 21">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:22>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 22">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:23>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 23">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
            </fourth-row>
            <fifth-row>
              <template  v-slot:24>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 24">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:25>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 25">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:26>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 26">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:27>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 27">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:28>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 28">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:29>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 29">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                  
                </div>
              </template>
              <template  v-slot:30>
                <div v-for="event in events" :key="event.event_id">
                  <div v-if="event.event_id == 30">
                    <p>{{ event.event_Name }}</p>
                    <p>{{ event.event_Category }}</p>
                    <p>{{ event.event_Time }}</p>
                  </div>
                </div>
              </template>
            </fifth-row>
          </div>
        </div>
      </div>
      <div class="col-xl-2 col-lg-2 col-md-2 col-sm-2 col-xs-2">
        <router-link to="/event" class="btn btn-primary">add new Event</router-link>
      </div>
    </div>
  </div>
</template>

<script>
import FirstRow from '~/components/firstRow.vue'
import SecondRow from '~/components/secondRow.vue'
import ThirdRow from '~/components/thirdRow.vue'
import FourthRow from '~/components/fourthRow.vue'
import FifthRow from '~/components/fifthRow.vue'
export default {
  async asyncData({ $axios }) {
      try {
      let response = await $axios.$get("http://localhost:8080/getEvents");

      return {
          events: response,
      }
      } catch (err) {
      console.log(err)
      }
  },
  components: {
    "first-row": FirstRow,
    "second-row": SecondRow,
    "third-row": ThirdRow,
    "fourth-row": FourthRow,
    "fifth-row": FifthRow,
  }
};
</script>

<style>



</style>
