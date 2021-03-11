package com.vamsi.meetings;

import java.util.Arrays;

public class MeetingRoomsII {

	public static void main(String[] args) {

		int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		System.out.println(minMeetingRooms(intervals));
	}

	public static int minMeetingRooms(int[][] intervals) {
		int[] starts = new int[intervals.length];
		int[] ends = new int[intervals.length];

		for (int i = 0; i < intervals.length; i++) {
			starts[i] = intervals[i][0];
			ends[i] = intervals[i][1];
		}

		Arrays.sort(starts);
		Arrays.sort(ends);
		int count = 1;
		int j = 0;
		for (int i = 1; i < intervals.length; i++) {
			// Compare next to the closest end (Since it is sorted)
			// if conflict then we need a new room so count++,
			// if no conflict then update/replace closest end with the next one
			// Starts = [1, 3, 6, 8, 12]
			// Ends = [2, 6, 8, 15, 20]
			if (ends[j] > starts[i]) {
				count++;
			} else {
				j++;
			}
		}

		return count;
	}

}
