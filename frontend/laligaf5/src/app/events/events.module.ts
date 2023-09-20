import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EventsRoutingModule } from './events-routing.module';
import { HomeComponent } from './views/home/home.component';
import { StaffComponent } from './views/staff/staff.component';
import { TeamsComponent } from './views/teams/teams.component';
import { TeamsdetailsComponent } from './views/teamsdetails/teamsdetails.component';
import { CalendarComponent } from './views/calendar/calendar.component';
import { CardteamComponent } from './components/cardteam/cardteam.component';
import { CarddetailsteamsComponent } from './components/carddetailsteams/carddetailsteams.component';
import { CardhomeComponent } from './components/cardhome/cardhome.component';


@NgModule({
  declarations: [
    // CardteamComponent,
    // CarddetailsteamsComponent,
    // CardhomeComponent
  ],
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
