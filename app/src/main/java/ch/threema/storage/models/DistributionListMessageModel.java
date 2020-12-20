/*  _____ _
 * |_   _| |_  _ _ ___ ___ _ __  __ _
 *   | | | ' \| '_/ -_) -_) '  \/ _` |_
 *   |_| |_||_|_| \___\___|_|_|_\__,_(_)
 *
 * Threema for Android
 * Copyright (c) 2013-2020 Threema GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package ch.threema.storage.models;

public class DistributionListMessageModel extends AbstractMessageModel {
	public static final String TABLE = "distribution_list_message";
	public static final String COLUMN_DISTRIBUTION_LIST_ID = "distributionListId";

	private int distributionListId;

	public DistributionListMessageModel() {
		super();
	}

	public DistributionListMessageModel(boolean isStatusMessage) {
		super(isStatusMessage);
	}

	public int getDistributionListId() {
		return this.distributionListId;
	}

	public DistributionListMessageModel setDistributionListId(int distributionListId) {
		this.distributionListId = distributionListId;
		return this;
	}

	@Override
	public String toString() {
		return "distribution_list_message.id = " + this.getId();
	}
}
