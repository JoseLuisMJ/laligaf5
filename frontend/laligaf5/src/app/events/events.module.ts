import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EventsRoutingModule } from './events-routing.module';
import { HomeComponent } from './views/home/home.component';
import { StaffComponent } from './views/staff/staff.component';
import { TeamsComponent } from './views/teams/teams.component';
import { TeamsdetailsComponent } from './views/teamsdetails/teamsdetails.component';
import { CalendarComponent } from './views/calendar/calendar.component';


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    EventsRoutingModule,
    // HomeComponent,
    // StaffComponent,
    // TeamsComponent,
    // TeamsdetailsComponent,
    // CalendarComponent
  ]
})
export class EventsModule { }
