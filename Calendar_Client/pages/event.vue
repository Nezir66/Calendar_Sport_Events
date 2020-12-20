<template>
    <div>
        <div class="container-fluid">
            <div class="row">
            <div class="col-xl-2 col-lg-2 col-md-2 col-sm-2 col-xs-2"></div>
            <div class="col-xl-8 col-lg-8 col-md-8 col-sm-8 col-xs-8">
                <div class="eventInput">
                    <input type="text" class="form-control" v-model="eventName" placeholder="Name of event">
                    <br>
                    <input type="text" class="form-control" v-model="eventTime" placeholder="Time of Event">
                    <br>
                    <input type="number" class="form-control" v-model="eventDay" placeholder="Day of Event">
                    <br>
                    <input type="text" class="form-control" v-model="category" placeholder="Category">
                    <br>
                    <input type="number" class="form-control" v-model="calenderId" placeholder="Calender Id">
                    <br>
                    <button class="btn btn-primary" @click="addNewEvent">Add Event</button>
                </div>
            </div>
            <div class="col-xl-2 col-lg-2 col-md-2 col-sm-2 col-xs-2"></div>
            </div>
        </div>
    </div>
</template>

<script>
import { mapMutations } from "vuex";
export default {
    data() {
        return {
            eventName: "",
            eventTime: "",
            category: "",
            calenderId: 0,
            eventDay: 0,
        }
    },
    methods: {
        ...mapMutations(["pushNewDay"]),

        async addNewEvent() {
            try {
                let event = {
                _calender_id: this.calenderId,
                event_Name: this.eventName,
                event_Category: this.category,
                event_Time: this.eventTime,
                event_id: this.eventDay,
                };

                let response = await this.$axios.post("http://localhost:8080/addEvent", event);
                this.$router.push("/");
            } catch (err) {
                console.log(err)
            }
            
        }
    }
}
</script>