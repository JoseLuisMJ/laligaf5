import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './global/header/header.component';
import { FooterComponent } from './global/footer/footer.component';
import { HomeComponent } from './events/views/home/home.component';
// import { TeamsComponent } from './views/teams/teams.component';
// import { TeamsdetailsComponent } from './views/teamsdetails/teamsdetails.component';
import { StaffComponent } from './events/views/staff/staff.component';
import { CalendarComponent } from './events/views/calendar/calendar.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    // TeamsComponent,
    // TeamsdetailsComponent,
    StaffComponent,
    CalendarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
