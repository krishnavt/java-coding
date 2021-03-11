package com.vamsi.meetings;

import java.util.Arrays;

public class MeetingRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// OLog(n)
	public static boolean canAttendMeetings(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		for (int i = 0; i < intervals.length - 1; i++) {
			// [i][1] index at this location, 1- endtime > next interval start time which is
			// 0 return false;
			if (intervals[i][1] > intervals[i + 1][0]) {
				return false;
			}
		}
		return true;
	}

}
