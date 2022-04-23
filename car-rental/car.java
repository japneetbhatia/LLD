const INITIAL_MONEY = 1000
const HOTEL_WORTH = 200
const HOTEL_RENT = 50
const JAIL_FINE = 150
const TREASURE_VALUE = 200

class Player {
	constructor(playerNumber) {
		this._playerNumber = playerNumber
		this._currentPosition = -1
		this._money = INITIAL_MONEY
		this._hotelsOwned = 0
	}

	getWorth() {
		return this._money + this._hotelsOwned * HOTEL_WORTH
	}
	getPlayerNumber() {
		return this._playerNumber
	}
	canAffordHotel() {
		return this._money >= HOTEL_WORTH
	}

	move(diceOutput, board) {
		const boardSize = board.getSize()
		this._currentPosition = (this._currentPosition + diceOutput) % boardSize
		const cell = board.getCell(this._currentPosition)
		if (!cell) console.log(this._currentPosition)
		cell.performLandAction(this)
	}
	transferMoney(amount) {
		this._money += amount
	}
	claimHotel() {
		this._hotelsOwned++
	}
}

class Cell {
	constructor() {}
	performLandAction() {}
}

class Jail extends Cell {
	constructor() {
		super()
	}
	performLandAction(player) {
		player.transferMoney(-JAIL_FINE)
	}
}

class Treasure extends Cell {
	constructor() {
		super()
	}
	performLandAction(player) {
		player.transferMoney(TREASURE_VALUE)
	}
}

class Hotel extends Cell {
	constructor() {
		super()
		this._owner = null
	}
	performLandAction(player) {
		if (this._owner) {
			player.transferMoney(-HOTEL_RENT)
			this._owner.transferMoney(HOTEL_RENT)
		} else if (player.canAffordHotel()) {
			player.transferMoney(-HOTEL_WORTH)
			player.claimHotel()
			this._owner = player
		}
	}
}

class Board {
	constructor(cells) {
		this._cells = cells
	}
	getSize() {
		return this._cells.length
	}
	getCell(index) {
		return this._cells[index]
	}
}

function businessHouseGame({numberOfPlayers, cellsInput, dice}) {
	// construct player objects
	const players = []
	for (let i = 1; i <= numberOfPlayers; i++) {
		players.push(new Player(i))
	}

	// construct cell objects and board
	const cells = []
	cellsInput.forEach((cellInput) => {
		let cell
		switch (cellInput) {
			case 'E': {
				cell = new Cell()
				break
			}
			case 'J': {
				cell = new Jail()
				break
			}
			case 'T': {
				cell = new Treasure()
				break
			}
			case 'H': {
				cell = new Hotel()
			}
		}
		cells.push(cell)
	})
	const board = new Board(cells)

	// play
	let turn = 0
	dice.forEach((diceOutput) => {
		const player = players[turn]
		player.move(diceOutput, board)
		turn = (turn + 1) % numberOfPlayers
	})

	// sort by worth
	players.sort((playerA, playerB) => {
		if (playerA.getWorth() <= playerB.getWorth()) return 1
		else return -1
	})

	// compile final result
	const result = []
	players.forEach((player) => {
		result.push(
			`Player-${player.getPlayerNumber()} has total worth ${player.getWorth()}`
		)
	})

	return result.join('\n')
}
