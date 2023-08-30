import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StaffComponent } from './views/staff/staff.component';
import { HomeComponent } from './views/home/home.component';
import { TeamsComponent } from './views/teams/teams.component';
import { TeamsdetailsComponent } from './views/teamsdetails/teamsdetails.component';
import { CalendarComponent } from './views/calendar/calendar.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent},
  { path: 'teams', component: TeamsComponent},
  { path: 'teamsdetails', component: TeamsdetailsComponent},
  { path: 'staff', component: StaffComponent},
  { path: 'calendar', component: CalendarComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class EventsRoutingModule { }
